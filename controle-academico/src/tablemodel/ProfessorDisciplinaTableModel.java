package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.ProfessorDisciplina;

public class ProfessorDisciplinaTableModel extends AbstractTableModel{
    private List<ProfessorDisciplina> listaProfessorDisciplina;
    private String[] colunas = {"Professor", "Disciplina", "Ano", "Semestre", "Dias"};

    public ProfessorDisciplinaTableModel() {
        listaProfessorDisciplina = new ArrayList<>();
    }
    
    public ProfessorDisciplinaTableModel(List<ProfessorDisciplina> alunosDisc){
        this();
        this.listaProfessorDisciplina.addAll(alunosDisc);
    }
    
    @Override
    public int getRowCount() {
        return listaProfessorDisciplina.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        ProfessorDisciplina pd = listaProfessorDisciplina.get(linha);
        switch(coluna){
            case 0:
                return pd.getProfessor().getNome();
            case 1:
                return pd.getDisciplina().getNome();
            case 2:
                return pd.getAno();
            case 3:
                return pd.getSemestre();
            case 4:
                return pd.getDia();               
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public ProfessorDisciplina getProfessorDisciplina(int linha){
        if(linha >= listaProfessorDisciplina.size()){
            return null;
        }
        return listaProfessorDisciplina.get(linha);
    }

}


