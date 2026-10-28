package BDconexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySQL1 {

    private static final String url = "jdbc:mysql://localhost:3306/livraria";
    private static final String user = "user";
    private static final String password = "senha";


    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL não encontrado.", e);
        }
    }

}
