package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.AlunoDisciplina;

public class AlunoDisciplinaTableModel extends AbstractTableModel{
    private List<AlunoDisciplina> listaAlunos;
    private String[] colunas = {"Aluno", "Disciplina", "Ano", "Semestre", "Nota 1", "Nota 2", " Média", "Faltas"};

    public AlunoDisciplinaTableModel() {
        listaAlunos = new ArrayList<>();
    }
    
    public AlunoDisciplinaTableModel(List<AlunoDisciplina> alunosDisc){
        this();
        this.listaAlunos.addAll(alunosDisc);
    }
    
    @Override
    public int getRowCount() {
        return listaAlunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        AlunoDisciplina a = listaAlunos.get(linha);
        switch(coluna){
            case 0:
                return a.getAluno().getNome();
            case 1:
                return a.getDisciplinas().getNome();
            case 2:
                return a.getAno();
            case 3:
                return a.getSemestre();
            case 4:
                return a.getNota1();
            case 5:
                return a.getNota2();
            case 6:
                return (a.getNota1()+a.getNota2())/2;
            case 7:
                return a.getFaltas();
                
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public AlunoDisciplina getAlunoDisciplina(int linha){
        if(linha >= listaAlunos.size()){
            return null;
        }
        return listaAlunos.get(linha);
    }

}

