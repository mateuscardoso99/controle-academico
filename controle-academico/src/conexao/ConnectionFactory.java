package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/dbControleAcademicoMateus";//banco de dados remoto coloca-se o endereco IP;
    private static final String USER = "postgres";
    private static final String SENHA = "1234";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, SENHA);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("falha ao conectar com o banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stat) {
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

        closeConnection(con);
    }

    public static void closeConnection(Connection con, PreparedStatement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("erro ao fechar a conexão" + ex);
            }
        }

        closeConnection(con, stat);
    }
    
}