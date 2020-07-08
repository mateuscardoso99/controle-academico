package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Disciplinas;

public class DisciplinaTableModel extends AbstractTableModel{
    
    private List<Disciplinas> listaDisc;
    private String[] colunas = {"Nome", "Código", "Carga Horária"};

    public DisciplinaTableModel() {
        listaDisc = new ArrayList<>();
    }
    
    public DisciplinaTableModel(List<Disciplinas> disc){
        this();
        this.listaDisc.addAll(disc);
    }
    
    @Override
    public int getRowCount() {
        return listaDisc.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Disciplinas d = listaDisc.get(linha);
        switch(coluna){
            case 0:
                return d.getNome();
            case 1:
                return d.getCodigo();
            case 2:
                return d.getCargaHoraria();
            
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Disciplinas getAluno(int linha){
        if(linha >= listaDisc.size()){
            return null;
        }
        return listaDisc.get(linha);
    }

}

