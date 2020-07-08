package controller;

import java.util.ArrayList;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;
import model.bean.Disciplinas;
import model.dao.ProfessorDAO;
import model.dao.ProfessorDisciplinaDAO;

public class ProfessorDisciplinaController {
    public boolean insert(Professor prof, Disciplinas disc, int semestre, int ano, String dias){
        ProfessorDisciplina pd = new ProfessorDisciplina();
        pd.setProfessor(prof);
        pd.setDisciplina(disc);
        pd.setSemestre(semestre);
        pd.setAno(ano);
        pd.setDia(dias);
        
        ProfessorDisciplinaDAO pdd = new ProfessorDisciplinaDAO();
        return pdd.insert(pd);
    }
    
    
    public boolean update(Professor prof, Disciplinas disc, int semestre, int ano, String dias){
        ProfessorDisciplina pd = new ProfessorDisciplina();
        pd.setProfessor(prof);
        pd.setDisciplina(disc);
        pd.setSemestre(semestre);
        pd.setAno(ano);
        pd.setDia(dias);
        
        ProfessorDisciplinaDAO pdd = new ProfessorDisciplinaDAO();
        return pdd.update(pd);
    }
    
    
    
    public ArrayList<ProfessorDisciplina> getDisciplinasProfessor(int idprof){
        ProfessorDisciplinaDAO pd = new ProfessorDisciplinaDAO();
        
        ArrayList<ProfessorDisciplina> array = new ArrayList<>();
        array = pd.getDisciplinasProfessor(idprof);
        
        for(ProfessorDisciplina pdesc : array){
            String dias = "";
            if(pdesc.getDia().contains("S")){
                dias += "Segunda ";
            }
            if(pdesc.getDia().contains("T")){
                dias += "Terça ";
            }
            if(pdesc.getDia().contains("Q")){
                dias += "Quarta ";
            }
            if(pdesc.getDia().contains("U")){
                dias += "Quinta ";
            }
            if(pdesc.getDia().contains("X")){
                dias += "Sexta ";
            }
            
            pdesc.setDia(dias);
        }
        return array;
    }
    
    
    public boolean delete(int idprof, int iddisc){
        ProfessorDisciplina pd = new ProfessorDisciplina();
        Professor prof = new Professor();
        prof.setIdprofessor(idprof);
        
        Disciplinas disc = new Disciplinas();
        disc.setId(iddisc);
        
        pd.setProfessor(prof);
        pd.setDisciplina(disc);
        
        ProfessorDisciplinaDAO p = new ProfessorDisciplinaDAO();
        return p.delete(pd);
    }
    
}

