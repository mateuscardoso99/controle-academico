package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Aluno;

public class AlunoTableModel extends AbstractTableModel{
    
    private List<Aluno> listaAlunos;
    private String[] colunas = {"Nome", "Endereço", "Fone", "E-mail", "Matrícula", "Curso"};

    public AlunoTableModel() {
        listaAlunos = new ArrayList<>();
    }
    
    public AlunoTableModel(List<Aluno> alunos){
        this();
        this.listaAlunos.addAll(alunos);
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
        Aluno a = listaAlunos.get(linha);
        switch(coluna){
            case 0:
                return a.getNome();
            case 1:
                return a.getEndereco();
            case 2:
                return a.getTelefone();
            case 3:
                return a.getEmail();
            case 4:
                return a.getMatricula();
            case 5:
                return a.getCurso();
            
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Aluno getAluno(int linha){
        if(linha >= listaAlunos.size()){
            return null;
        }
        return listaAlunos.get(linha);
    }

}
