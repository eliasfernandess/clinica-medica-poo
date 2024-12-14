package br.edu.imepac.administrativo.daos;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

    public class GenericDao {
        private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        protected Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
