package com.movieworkshop.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    public static Connection getConn() {
        hostname = "jdbc:mysql://keadatabase.mysql.database.azure.com/movies";
        username = "malik2635";
        password = "Nwr92auv";

        try {
            conn = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde til database");
            throw new RuntimeException(e);
        }
        System.out.println("Forbindelse til database OK!");
        return conn;
    }
}
