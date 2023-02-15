package com.example.mysql.respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {


    // Variabler
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    // Metoder

    public static Connection getConnection() {
        hostname = "jdbc:mysql://clbodat22v1.mysql.database.azure.com/kea";
        username = "clbo";
        password = "qwerty_1234";

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
