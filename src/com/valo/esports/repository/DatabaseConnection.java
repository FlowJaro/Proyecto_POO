package com.valo.esports.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/valorant_esports";
    private static final String USER = "root";
    private static final String PASSWORD = "KaRay020917+";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}