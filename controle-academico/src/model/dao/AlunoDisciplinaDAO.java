package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplinas;

public class AlunoDisciplinaDAO {

    Connection con = ConnectionFactory.getConnection();

    public boolean insert(AlunoDisciplina ad) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO aluno_disciplina(\n"
                    + "	idaluno, iddisciplina, semestre, ano, nota1, nota2, faltas)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?)");
            stat.setInt(1, ad.getAluno().getId());
            stat.setInt(2, ad.getDisciplinas().getId());
            stat.setInt(3, ad.getSemestre());
            stat.setInt(4, ad.getAno());
            stat.setDouble(5, ad.getNota1());
            stat.setDouble(6, ad.getNota2());
            stat.setInt(7, ad.getFaltas());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public boolean update(AlunoDisciplina ad) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("UPDATE aluno_disciplina SET semestre=?,ano=?,nota1=?,nota2=?,faltas=? WHERE idaluno=? AND iddisciplina=?");
            stat.setInt(1, ad.getSemestre());
            stat.setInt(2, ad.getAno());
            stat.setDouble(3, ad.getNota1());
            stat.setDouble(4, ad.getNota2());
            stat.setInt(5, ad.getFaltas());
            stat.setInt(6, ad.getAluno().getId());
            stat.setInt(7, ad.getDisciplinas().getId());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public boolean delete(AlunoDisciplina a) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("DELETE FROM aluno_disciplina WHERE idaluno = ? AND iddisciplina = ?");
            stat.setInt(1, a.getAluno().getId());
            stat.setInt(2, a.getDisciplinas().getId());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public ArrayList<AlunoDisciplina> read(Aluno all) {
        PreparedStatement stat = null;
        ResultSet rs = null;

        ArrayList<AlunoDisciplina> vetor = new ArrayList<>();

        try {
            stat = con.prepareStatement("SELECT * FROM view_aluno_disciplina WHERE idaluno = ?");
            stat.setInt(1, all.getId());
            rs = stat.executeQuery();

            while (rs.next()) {
                AlunoDisciplina a = new AlunoDisciplina();
                a.setSemestre(rs.getInt("semestre"));
                a.setAno(rs.getInt("ano"));
                a.setNota1(rs.getDouble("nota1"));
                a.setNota2(rs.getDouble("nota2"));
                a.setFaltas(rs.getInt("faltas"));

                Aluno al = new Aluno();
                al.setId(rs.getInt("idaluno"));
                al.setNome(rs.getString("nome"));

                Disciplinas d = new Disciplinas();
                d.setId(rs.getInt("iddisciplina"));
                d.setNome(rs.getString("disciplina"));

                a.setAluno(al);
                a.setDisciplinas(d);

                vetor.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao ler", "", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stat, rs);
        }

        return vetor;

    }

}
