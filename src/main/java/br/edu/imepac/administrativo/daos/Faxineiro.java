package br.edu.imepac.administrativo.daos;

public class Faxineiro {

    package br.edu.imepac.administrativo.dao;

import br.edu.imepac.administrativo.model.Faxineiro;
import java.sql .*;
import java.util.ArrayList;
import java.util.List;

    public class FaxineiroDAO implements GenericDAO<Faxineiro> {
        private final String url = "jdbc:mysql://127.0.0.1:3306/nome_do_banco";
        private final String user = "root";
        private final String password = "sua_senha";

        @Override
        public void save(Faxineiro faxineiro) {
            String sql = "INSERT INTO faxineiros (nome, email, telefone) VALUES (?, ?, ?)";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, faxineiro.getNome());
                stmt.setString(2, faxineiro.getEmail());
                stmt.setString(3, faxineiro.getTelefone());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void update(Faxineiro faxineiro) {
            String sql = "UPDATE faxineiros SET nome=?, email=?, telefone=? WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, faxineiro.getNome());
                stmt.setString(2, faxineiro.getEmail());
                stmt.setString(3, faxineiro.getTelefone());
                stmt.setInt(4, faxineiro.getId());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void delete(int id) {
            String sql = "DELETE FROM faxineiros WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Faxineiro findById(int id) {
            String sql = "SELECT * FROM faxineiros WHERE id=?";
            Faxineiro faxineiro = null;
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    faxineiro = new Faxineiro(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone")
                    );
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return faxineiro;
        }

        @Override
        public List<Faxineiro> findAll() {
            String sql = "SELECT * FROM faxineiros";
            List<Faxineiro> faxineiros = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Faxineiro faxineiro = new Faxineiro(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone")
                    );
                    faxineiros.add(faxineiro);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return faxineiros;
        }
    }
package br.edu.imepac.administrativo.model;

    public class Faxineiro {
        private int id;
        private String nome;
        private String email;
        private String telefone;

        public Faxineiro(int id, String nome, String email, String telefone) {
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

}
