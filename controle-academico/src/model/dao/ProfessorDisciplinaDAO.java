package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;
import model.bean.Disciplinas;

public class ProfessorDisciplinaDAO {

    Connection con = ConnectionFactory.getConnection();

    public boolean insert(ProfessorDisciplina pd) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO professor_disciplina(\n"
                    + "	idprofessor, iddisciplina, semestre, ano, dias)\n"
                    + "	VALUES (?, ?, ?, ?, ?)");
            stat.setInt(1, pd.getProfessor().getIdprofessor());
            stat.setInt(2, pd.getDisciplina().getId());
            stat.setInt(3, pd.getSemestre());
            stat.setInt(4, pd.getAno());
            stat.setString(5, pd.getDia());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    
    public boolean update(ProfessorDisciplina pd) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("UPDATE professor_disciplina SET semestre=?,ano=?,dias=?"
                    + " WHERE idprofessor = ? AND iddisciplina = ?");
            stat.setInt(1, pd.getSemestre());
            stat.setInt(2, pd.getAno());
            stat.setString(3, pd.getDia());
            stat.setInt(4, pd.getProfessor().getIdprofessor());
            stat.setInt(5, pd.getDisciplina().getId());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public boolean delete(ProfessorDisciplina pd) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("DELETE FROM professor_disciplina "
                    + "WHERE idprofessor = ? AND iddisciplina = ?");
            stat.setInt(1, pd.getProfessor().getIdprofessor());
            stat.setInt(2, pd.getDisciplina().getId());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public ArrayList<ProfessorDisciplina> getDisciplinasProfessor(int idprof) {
        PreparedStatement stat = null;
        ResultSet rs = null;

        ArrayList<ProfessorDisciplina> vetor = new ArrayList<>();

        try {
            stat = con.prepareStatement("SELECT al.idprofessor, prof.nome, al.iddisciplina,"
                    + "d.nome as disciplina, al.ano, al.semestre, al.dias FROM professor_disciplina al "
                    + "INNER JOIN professor prof ON prof.idprofessor = al.idprofessor "
                    + "INNER JOIN disciplina d ON al.iddisciplina = d.iddisciplina WHERE al.idprofessor = ?");
                        
            stat.setInt(1, idprof);
            rs = stat.executeQuery();

            while (rs.next()) {
                ProfessorDisciplina pd = new ProfessorDisciplina();
                Professor prof = new Professor();
                
                prof.setIdprofessor(rs.getInt("idprofessor"));
                prof.setNome(rs.getString("nome"));
                
                pd.setProfessor(prof);
                
                Disciplinas disc = new Disciplinas();
                disc.setId(rs.getInt("iddisciplina"));
                disc.setNome(rs.getString("disciplina"));
                
                pd.setDisciplina(disc);
                pd.setAno(rs.getInt("ano"));
                pd.setSemestre(rs.getInt("semestre"));
                pd.setDia(rs.getString("dias"));

                vetor.add(pd);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao ler", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stat, rs);
        }

        return vetor;

    }

}

