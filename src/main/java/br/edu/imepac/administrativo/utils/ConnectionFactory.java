/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.administrativo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/Convenio"; // Altere para seu banco
    private static final String USER = "root"; // Altere para seu usuário
    private static final String PASSWORD = "elias"; // Altere para sua senha

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carrega o driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado!", e);
        }
    }
}

