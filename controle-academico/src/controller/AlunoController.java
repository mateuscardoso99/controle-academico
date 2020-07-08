package controller;

import java.util.ArrayList;
import model.bean.Aluno;
import model.dao.AlunoDAO;

public class AlunoController {
    public boolean insert(String nome, String endereco, String telefone, String email, String matricula, String curso){
        Aluno a = new Aluno();
        a.setNome(nome);
        a.setEndereco(endereco);
        a.setTelefone(telefone);
        a.setEmail(email);
        a.setMatricula(matricula);
        a.setCurso(curso);
        
        AlunoDAO ad = new AlunoDAO();
        return ad.insert(a);
    }
    
    public ArrayList<Aluno> read(){
        AlunoDAO ad = new AlunoDAO();
        return ad.read();
    }
    
    public boolean update(int id, String nome, String endereco, String telefone, String email, String matricula, String curso){
        Aluno a = new Aluno();
        a.setId(id);
        a.setNome(nome);
        a.setEndereco(endereco);
        a.setTelefone(telefone);
        a.setEmail(email);
        a.setMatricula(matricula);
        a.setCurso(curso);
        
        AlunoDAO ad = new AlunoDAO();
        return ad.update(a);
    }
    
    public boolean delete(int id){
        Aluno a = new Aluno();
        a.setId(id);
        
        AlunoDAO ad = new AlunoDAO();
        return ad.delete(a);
    }
    
    public ArrayList<Aluno> getAlunosNome(String n){     
        AlunoDAO ad = new AlunoDAO();
        return ad.getAlunosNome(n);
    }
    
    public ArrayList<Aluno> getAlunosMatr(String matr){     
        AlunoDAO ad = new AlunoDAO();
        return ad.getAlunosMatr(matr);
    }
    
    public ArrayList<Aluno> getAlunosCurso(String curso){     
        AlunoDAO ad = new AlunoDAO();
        return ad.getAlunosCurso(curso);
    }
    
    
}
