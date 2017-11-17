package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinestore", "root", "Best1234Aum");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("!" + ex);
        }
        return conn;
    }
    public static void main(String[] args) {
        Connection conn = getConnection();
                
    }
}