package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Disciplinas;


public class DisciplinasDAO {

    Connection con = ConnectionFactory.getConnection();
        
        public boolean insert(Disciplinas d){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("INSERT INTO disciplina (nome,codigo,cargahoraria) VALUES (?,?,?)");
                stat.setString(1, d.getNome());
                stat.setString(2, d.getCodigo());
                stat.setInt(3, d.getCargaHoraria());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao inserir disciplina", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        public ArrayList<Disciplinas> read(){
            PreparedStatement stat = null;
            ResultSet rs = null;
            
            ArrayList <Disciplinas> vetorDisc = new ArrayList<>();
            
            try{
                stat = con.prepareStatement("SELECT * FROM disciplina");
                rs = stat.executeQuery();
                
                while(rs.next()){
                    Disciplinas d = new Disciplinas();
                    d.setId(rs.getInt("iddisciplina"));
                    d.setNome(rs.getString("nome"));
                    d.setCodigo(rs.getString("codigo"));
                    d.setCargaHoraria(rs.getInt("cargahoraria"));
                    
                    vetorDisc.add(d);
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao ler as disciplinas", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, rs);
            }
            
            return vetorDisc;
            
        }
    
        
        
        public boolean update(Disciplinas d){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("UPDATE disciplina SET nome=?,codigo=?,cargahoraria=? WHERE iddisciplina = ?");
                stat.setString(1, d.getNome());
                stat.setString(2, d.getCodigo());
                stat.setInt(3, d.getCargaHoraria());
                stat.setInt(4, d.getId());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao atualizar disciplina", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
    
        
        
        
        public boolean delete(Disciplinas d){
            PreparedStatement stat = null;
            
            try{
                stat = con.prepareStatement("DELETE FROM disciplina WHERE iddisciplina = ?");
                stat.setLong(1, d.getId());
                
                stat.executeUpdate();
                
                return true;
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erro ao excluir o aluno", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }finally{
                ConnectionFactory.closeConnection(con, stat);
            }
        }
        
        
        
        
}
