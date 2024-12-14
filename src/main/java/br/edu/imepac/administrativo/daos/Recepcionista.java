package br.edu.imepac.administrativo.daos;

public class Recepcionista {

    package br.edu.imepac.administrativo.model;

    public class Recepcionista {
        private int id;
        private String nome;
        private String email;
        private String telefone;

        public Recepcionista(int id, String nome, String email, String telefone) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }

        // Getters e Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }
    }
package br.edu.imepac.administrativo.dao;

import br.edu.imepac.administrativo.model.Recepcionista;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class RecepcionistaDAO implements GenericDAO<Recepcionista> {
        private final String url = "jdbc:mysql://127.0.0.1:3306/nome_do_banco";
        private final String user = "root";
        private final String password = "sua_senha";

        @Override
        public void save(Recepcionista recepcionista) {
            String sql = "INSERT INTO recepcionistas (nome, email, telefone) VALUES (?, ?, ?)";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, recepcionista.getNome());
                stmt.setString(2, recepcionista.getEmail());
                stmt.setString(3, recepcionista.getTelefone());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void update(Recepcionista recepcionista) {
            String sql = "UPDATE recepcionistas SET nome=?, email=?, telefone=? WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, recepcionista.getNome());
                stmt.setString(2, recepcionista.getEmail());
                stmt.setString(3, recepcionista.getTelefone());
                stmt.setInt(4, recepcionista.getId());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void delete(int id) {
            String sql = "DELETE FROM recepcionistas WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Recepcionista findById(int id) {
            String sql = "SELECT * FROM recepcionistas WHERE id=?";
            Recepcionista recepcionista = null;
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    recepcionista = new Recepcionista(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone")
                    );
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return recepcionista;
        }

        @Override
        public List<Recepcionista> findAll() {
            String sql = "SELECT * FROM recepcionistas";
            List<Recepcionista> recepcionistas = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Recepcionista recepcionista = new Recepcionista(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone")
                    );
                    recepcionistas.add(recepcionista);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return recepcionistas;
        }
    }

}
