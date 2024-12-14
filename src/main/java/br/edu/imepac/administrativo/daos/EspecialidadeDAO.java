package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Especialidade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadeDAO extends BaseDao {

    public void create(Especialidade especialidade) throws SQLException {
        String sql = "INSERT INTO especialidade (nome, descricao) VALUES (?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, especialidade.getNome());
            stmt.setString(2, especialidade.getDescricao());
            stmt.executeUpdate();
        }
    }

    public Especialidade read(Long id) throws SQLException {
        String sql = "SELECT * FROM especialidade WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Especialidade(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("descricao")
                );
            }
        }
        return null;
    }

    public List<Especialidade> readAll() throws SQLException {
        String sql = "SELECT * FROM especialidade";
        List<Especialidade> especialidades = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                especialidades.add(new Especialidade(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("descricao")
                ));
            }
        }
        return especialidades;
    }

    public void update(Especialidade especialidade) throws SQLException {
        String sql = "UPDATE especialidade SET nome = ?, descricao = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, especialidade.getNome());
            stmt.setString(2, especialidade.getDescricao());
            stmt.setLong(3, especialidade.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM especialidade WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}