package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Aluno;

public class AlunoDAO {
    Connection con = ConnectionFactory.getConnection();
        
        public boolean insert(Aluno a){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("INSERT INTO aluno (nome,endereco,fone,email,matricula,curso) VALUES (?,?,?,?,?,?)");
                stat.setString(1, a.getNome());
                stat.setString(2, a.getEndereco());
                stat.setString(3, a.getTelefone());
                stat.setString(4, a.getEmail());
                stat.setString(5, a.getMatricula());
                stat.setString(6, a.getCurso());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao inserir aluno", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        public ArrayList<Aluno> read(){
            PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList <Aluno> vetorAlunos = new ArrayList<>();
            
            try{
                stat = con.prepareStatement("SELECT * FROM aluno");
                rs = stat.executeQuery();
                
                while(rs.next()){
                    Aluno a = new Aluno();
                    a.setId(rs.getInt("idaluno"));
                    a.setNome(rs.getString("nome"));
                    a.setEndereco(rs.getString("endereco"));
                    a.setTelefone(rs.getString("fone"));
                    a.setEmail(rs.getString("email"));
                    a.setMatricula(rs.getString("matricula"));
                    a.setCurso(rs.getString("curso"));
                    
                    vetorAlunos.add(a);
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao inserir aluno", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetorAlunos;
            
        }
    
        
        
        public boolean update(Aluno a){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("UPDATE aluno SET nome=?,endereco=?,fone=?,email=?,matricula=?,curso=? WHERE idaluno = ?");
                stat.setString(1, a.getNome());
                stat.setString(2, a.getEndereco());
                stat.setString(3, a.getTelefone());
                stat.setString(4, a.getEmail());
                stat.setString(5, a.getMatricula());
                stat.setString(6, a.getCurso());
                stat.setLong(7, a.getId());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao atualizar aluno", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        
        public boolean delete(Aluno a){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("DELETE FROM aluno WHERE idaluno = ?");
                stat.setLong(1, a.getId());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao excluir o aluno", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
        
        
        
        public ArrayList<Aluno> getAlunosNome(String n){
            PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Aluno> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM aluno WHERE nome LIKE ? ORDER BY idaluno");
                stat.setString(1, "%" +n+ "%");
                rs=stat.executeQuery();
                
                while(rs.next()){
                    Aluno a = new Aluno();
                  //  a.setId(rs.getLong("idaluno"));
                    a.setNome(rs.getString("nome"));
                    a.setEndereco(rs.getString("endereco"));
                    a.setTelefone(rs.getString("fone"));
                    a.setEmail(rs.getString("email"));
                    a.setMatricula(rs.getString("matricula"));
                    a.setCurso(rs.getString("curso"));
                    
                    vetor.add(a);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os alunos", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
            
        }
        
        
        
        public ArrayList<Aluno> getAlunosMatr(String matr){
             PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Aluno> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM aluno WHERE matricula = ? ORDER BY idaluno");
                stat.setString(1, matr);
                rs=stat.executeQuery();
                
                while(rs.next()){
                    Aluno a = new Aluno();
                  //  a.setId(rs.getLong("idaluno"));
                    a.setNome(rs.getString("nome"));
                    a.setEndereco(rs.getString("endereco"));
                    a.setTelefone(rs.getString("fone"));
                    a.setEmail(rs.getString("email"));
                    a.setMatricula(rs.getString("matricula"));
                    a.setCurso(rs.getString("curso"));
                    
                    vetor.add(a);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os alunos", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
        }
        
        
        
        public ArrayList<Aluno> getAlunosCurso(String c){
             PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Aluno> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM aluno WHERE curso = ? ORDER BY idaluno");
                stat.setString(1, c);
                rs=stat.executeQuery();
                
                while(rs.next()){
                    Aluno a = new Aluno();
                  //  a.setId(rs.getLong("idaluno"));
                    a.setNome(rs.getString("nome"));
                    a.setEndereco(rs.getString("endereco"));
                    a.setTelefone(rs.getString("fone"));
                    a.setEmail(rs.getString("email"));
                    a.setMatricula(rs.getString("matricula"));
                    a.setCurso(rs.getString("curso"));
                    
                    vetor.add(a);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os alunos", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
        }
        
}
