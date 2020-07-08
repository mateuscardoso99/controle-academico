package controller;

import java.util.ArrayList;
import model.bean.Disciplinas;
import model.dao.DisciplinasDAO;

public class DisciplinasController {

    public boolean insert(String nome, String codigo, int ch){
        Disciplinas d = new Disciplinas();
        d.setNome(nome);
        d.setCodigo(codigo);
        d.setCargaHoraria(ch);
        
        DisciplinasDAO ad = new DisciplinasDAO();
        return ad.insert(d);
    }
    
    public ArrayList<Disciplinas> read(){
        DisciplinasDAO ad = new DisciplinasDAO();
        return ad.read();
    }
    
    public boolean update(int id, String nome, String codigo, int ch){
        Disciplinas d = new Disciplinas();
        d.setId(id);
        d.setNome(nome);
        d.setCodigo(codigo);
        d.setCargaHoraria(ch);
        
        DisciplinasDAO ad = new DisciplinasDAO();
        return ad.update(d);
    }
    
    public boolean delete(int id){
        Disciplinas d = new Disciplinas();
        d.setId(id);
        
        DisciplinasDAO ad = new DisciplinasDAO();
        return ad.delete(d);
    }
}
