package controller;

import java.util.ArrayList;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplinas;
import model.dao.AlunoDAO;
import model.dao.AlunoDisciplinaDAO;

public class AlunoDisciplinaContoller {
    public boolean insert(Aluno aluno, Disciplinas disc, int semestre, int ano, double nota1, double nota2, int faltas){
        AlunoDisciplina ad = new AlunoDisciplina();
        ad.setAluno(aluno);
        ad.setDisciplinas(disc);
        ad.setSemestre(semestre);
        ad.setAno(ano);
        ad.setNota1(nota1);
        ad.setNota2(nota2);
        ad.setFaltas(faltas);
        
        AlunoDisciplinaDAO add = new AlunoDisciplinaDAO();
        return add.insert(ad);
    }
    
    
    public boolean update(Aluno aluno, Disciplinas disc, int semestre, int ano, double nota1, double nota2, int faltas){
        AlunoDisciplina ad = new AlunoDisciplina();
        ad.setAluno(aluno);
        ad.setDisciplinas(disc);
        ad.setSemestre(semestre);
        ad.setAno(ano);
        ad.setNota1(nota1);
        ad.setNota2(nota2);
        ad.setFaltas(faltas);
        
        AlunoDisciplinaDAO add = new AlunoDisciplinaDAO();
        return add.update(ad);
    }
    
    
    public ArrayList<AlunoDisciplina> read(Aluno a){
        AlunoDisciplinaDAO ad = new AlunoDisciplinaDAO();
        return ad.read(a);
    }
    
    
    public boolean delete(Aluno aluno, Disciplinas disc){
        AlunoDisciplina a = new AlunoDisciplina();
        a.setAluno(aluno);
        a.setDisciplinas(disc);
        
        AlunoDisciplinaDAO add = new AlunoDisciplinaDAO();
        return add.delete(a);
    }
    
}
