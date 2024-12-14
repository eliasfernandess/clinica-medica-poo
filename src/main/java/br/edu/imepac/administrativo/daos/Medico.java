package br.edu.imepac.administrativo.daos;

public class Medico {

    package br.edu.imepac.administrativo.dao;

import java.util.List;

    public interface GenericDAO<T> {
        void save(T entity);

        void update(T entity);

        void delete(int id);

        T findById(int id);

        List<T> findAll();
    }
package br.edu.imepac.administrativo.dao;

import br.edu.imepac.administrativo.model.Medico;
import java.sql .*;
import java.util.ArrayList;
import java.util.List;

    public class MedicoDAO implements GenericDAO<Medico> {
        private final String url = "jdbc:mysql://127.0.0.1:3306/nome_do_banco";
        private final String user = "root";
        private final String password = "sua_senha";

        @Override
        public void save(Medico medico) {
            String sql = "INSERT INTO medicos (nome, email, crm, especialidade) VALUES (?, ?, ?, ?)";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, medico.getNome());
                stmt.setString(2, medico.getEmail());
                stmt.setInt(3, medico.getCrm());
                stmt.setString(4, medico.getEspecialidade());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void update(Medico medico) {
            String sql = "UPDATE medicos SET nome=?, email=?, crm=?, especialidade=? WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, medico.getNome());
                stmt.setString(2, medico.getEmail());
                stmt.setInt(3, medico.getCrm());
                stmt.setString(4, medico.getEspecialidade());
                stmt.setInt(5, medico.getId());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void delete(int id) {
            String sql = "DELETE FROM medicos WHERE id=?";
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public Medico findById(int id) {
            String sql = "SELECT * FROM medicos WHERE id=?";
            Medico medico = null;
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    medico = new Medico(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getInt("crm"),
                            rs.getString("especialidade")
                    );
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return medico;
        }

        @Override
        public List<Medico> findAll() {
            String sql = "SELECT * FROM medicos";
            List<Medico> medicos = new ArrayList<>();
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Medico medico = new Medico(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getInt("crm"),
                            rs.getString("especialidade")
                    );
                    medicos.add(medico);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return medicos;
        }
    }
package br.edu.imepac.administrativo.model;

    public class Medico {
        private int id;
        private String nome;
        private String email;
        private int crm;
        private String especialidade;

        public Medico(int id, String nome, String email, int crm, String especialidade) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.crm = crm;
            this.especialidade = especialidade;
        }

        // Getters e Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getCrm() {
            return crm;
        }

        public void setCrm(int crm) {
            this.crm = crm;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }
    }

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Medico medico = new Medico(0, "Nome do Médico", "email@exemplo.com", 1234, "Cardiologista");
        MedicoDAO medicoDAO = new MedicoDAO();
        medicoDAO.save(medico);
        System.out.println("Médico cadastrado com sucesso!");
    }

}
