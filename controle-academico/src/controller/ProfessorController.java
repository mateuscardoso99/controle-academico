package controller;

import java.util.ArrayList;
import model.bean.Professor;
import model.dao.ProfessorDAO;

public class ProfessorController {
    public boolean insert(String nome, String endereco, String telefone, String email, String formacao, String titulacao, double salario){
        Professor p = new Professor();
        p.setNome(nome);
        p.setEndereco(endereco);
        p.setFone(telefone);
        p.setEmail(email);
        p.setFormacao(formacao);
        p.setTitulacao(titulacao);
        p.setSalario(salario);
        
        ProfessorDAO pro = new ProfessorDAO();
        return pro.insert(p);
    }
    
    public ArrayList<Professor> read(){
        ProfessorDAO pro = new ProfessorDAO();
        return pro.read();
    }
    
     public boolean update(int id, String nome, String endereco, String telefone, String email, String formacao, String titulacao, double salario){
        Professor p = new Professor();
        p.setIdprofessor(id);
        p.setNome(nome);
        p.setEndereco(endereco);
        p.setFone(telefone);
        p.setEmail(email);
        p.setFormacao(formacao);
        p.setTitulacao(titulacao);
        p.setSalario(salario);
        
        ProfessorDAO pro = new ProfessorDAO();
        return pro.update(p);
    }
    
    
    public boolean delete(int id){
        Professor p = new Professor();
        p.setIdprofessor(id);
        
        ProfessorDAO pro = new ProfessorDAO();
        return pro.delete(p);
    }
    
    public ArrayList<Professor> getProfessoresNome(String n){     
        ProfessorDAO pd = new ProfessorDAO();
        return pd.getProfessoresNome(n);
    }
    
    public ArrayList<Professor> getProfessoresFormacao(String matr){     
        ProfessorDAO pd = new ProfessorDAO();
        return pd.getProfessoresFormacao(matr);
    }
    
    public ArrayList<Professor> getProfessoresTitulacao(String curso){     
        ProfessorDAO pd = new ProfessorDAO();
        return pd.getProfessoresTitulacao(curso);
    }
    
    
}

