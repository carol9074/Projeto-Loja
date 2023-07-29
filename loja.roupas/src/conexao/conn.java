package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {

    private static final String url = "jdbc:mysql://localhost:3306/loja";
    private static final String user = "root";
    private static final String pass = "senacrs";

    private static Connection conn;

    public static Connection getConnection() {

        try {

            if (conn == null) {
                conn = DriverManager.getConnection(url, user, pass);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}

