package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Professor;

public class ProfessorTableModel extends AbstractTableModel{
    
    private List<Professor> listaProfessores;
    private String[] colunas = {"Nome", "Endereço", "Fone", "E-mail", "Formação", "Titulação", "Salário"};

    public ProfessorTableModel() {
        listaProfessores = new ArrayList<>();
    }
    
    public ProfessorTableModel(List<Professor> Professor){
        this();
        this.listaProfessores.addAll(Professor);
    }
    
    @Override
    public int getRowCount() {
        return listaProfessores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Professor p = listaProfessores.get(linha);
        switch(coluna){
            case 0:
                return p.getNome();
            case 1:
                return p.getEndereco();
            case 2:
                return p.getFone();
            case 3:
                return p.getEmail();
            case 4:
                return p.getFormacao();
            case 5:
                return p.getTitulacao();
            case 6:
                return p.getSalario();
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Professor getAluno(int linha){
        if(linha >= listaProfessores.size()){
            return null;
        }
        return listaProfessores.get(linha);
    }

}

