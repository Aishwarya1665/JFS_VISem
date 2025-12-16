package com.skillnext2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/skillnext2_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "aishu@16"; // your MySQL password

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Ensure driver is loaded (works for all Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver class not found:");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL / Connection error:");
            e.printStackTrace();
        }
        return con;
    }
}
