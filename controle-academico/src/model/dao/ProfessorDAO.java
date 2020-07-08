package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Professor;

public class ProfessorDAO {
    Connection con = ConnectionFactory.getConnection();
        
        public boolean insert(Professor p){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("INSERT INTO professor (nome,endereco,fone,email,formacao,titulacao,salario) VALUES (?,?,?,?,?,?,?)");
                stat.setString(1, p.getNome());
                stat.setString(2, p.getEndereco());
                stat.setString(3, p.getFone());
                stat.setString(4, p.getEmail());
                stat.setString(5, p.getFormacao());
                stat.setString(6, p.getTitulacao());
                stat.setDouble(7, p.getSalario());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao inserir professor", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        public ArrayList<Professor> read(){
            PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList <Professor> vetorP = new ArrayList<>();
            
            try{
                stat = con.prepareStatement("SELECT * FROM professor");
                rs = stat.executeQuery();
                
                while(rs.next()){
                    Professor p = new Professor();
                    p.setIdprofessor(rs.getInt("idprofessor"));
                    p.setNome(rs.getString("nome"));
                    p.setEndereco(rs.getString("endereco"));
                    p.setFone(rs.getString("fone"));
                    p.setEmail(rs.getString("email"));
                    p.setFormacao(rs.getString("formacao"));
                    p.setTitulacao(rs.getString("titulacao"));
                    p.setSalario(rs.getDouble("salario"));
                    
                    vetorP.add(p);
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao ler", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetorP;
            
        }
    
        
        
        public boolean update(Professor p){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("UPDATE professor SET nome=?,endereco=?,fone=?,email=?,formacao=?,"
                        + "titulacao=?,salario=? WHERE idprofessor = ?");
                stat.setString(1, p.getNome());
                stat.setString(2, p.getEndereco());
                stat.setString(3, p.getFone());
                stat.setString(4, p.getEmail());
                stat.setString(5, p.getFormacao());
                stat.setString(6, p.getTitulacao());
                stat.setDouble(7, p.getSalario());
                stat.setLong(8, p.getIdprofessor());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao atualizar professor", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        
        public boolean delete(Professor p){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("DELETE FROM professor WHERE idprofessor = ?");
                stat.setLong(1, p.getIdprofessor());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao excluir professor", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
        
        
        
        public ArrayList<Professor> getProfessoresNome(String n){
            PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Professor> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM professor WHERE nome LIKE ? ORDER BY idprofessor");
                stat.setString(1, "%" +n+ "%");
                rs=stat.executeQuery();
                
                while(rs.next()){
                    Professor p = new Professor();
                    p.setIdprofessor(rs.getInt("idprofessor"));
                    p.setNome(rs.getString("nome"));
                    p.setEndereco(rs.getString("endereco"));
                    p.setFone(rs.getString("fone"));
                    p.setEmail(rs.getString("email"));
                    p.setFormacao(rs.getString("formacao"));
                    p.setTitulacao(rs.getString("titulacao"));
                    p.setSalario(rs.getDouble("salario"));
                    
                    vetor.add(p);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os professores", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
            
        }
        
        
        
        public ArrayList<Professor> getProfessoresFormacao(String matr){
             PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Professor> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM aluno WHERE matricula = ? ORDER BY idprofessor");
                stat.setString(1, matr);
                rs=stat.executeQuery();
                
                 while(rs.next()){
                    Professor p = new Professor();
                    p.setIdprofessor(rs.getInt("idprofessor"));
                    p.setNome(rs.getString("nome"));
                    p.setEndereco(rs.getString("endereco"));
                    p.setFone(rs.getString("fone"));
                    p.setEmail(rs.getString("email"));
                    p.setFormacao(rs.getString("formacao"));
                    p.setTitulacao(rs.getString("titulacao"));
                    p.setSalario(rs.getDouble("salario"));
                    
                    vetor.add(p);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os professores", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
        }
        
        
        
        public ArrayList<Professor> getProfessoresTitulacao(String c){
             PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList<Professor> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT * FROM aluno WHERE curso = ? ORDER BY idaluno");
                stat.setString(1, c);
                rs=stat.executeQuery();
                
                 while(rs.next()){
                    Professor p = new Professor();
                    p.setIdprofessor(rs.getInt("idprofessor"));
                    p.setNome(rs.getString("nome"));
                    p.setEndereco(rs.getString("endereco"));
                    p.setFone(rs.getString("fone"));
                    p.setEmail(rs.getString("email"));
                    p.setFormacao(rs.getString("formacao"));
                    p.setTitulacao(rs.getString("titulacao"));
                    p.setSalario(rs.getDouble("salario"));
                    
                    vetor.add(p);
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os Professores", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetor;
        }
        
}

