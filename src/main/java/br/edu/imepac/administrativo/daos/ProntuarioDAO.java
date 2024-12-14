package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Prontuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProntuarioDAO extends BaseDao {

    public void create(Prontuario prontuario) throws SQLException {
        String sql = "INSERT INTO prontuario (receituario, exames, observacoes) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, prontuario.getReceituario());
            stmt.setString(2, prontuario.getExames());
            stmt.setString(3, prontuario.getObservacoes());
            stmt.executeUpdate();
        }
    }

    public Prontuario read(Long id) throws SQLException {
        String sql = "SELECT * FROM prontuario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Prontuario(
                        rs.getLong("id"),
                        rs.getString("receituario"),
                        rs.getString("exames"),
                        rs.getString("observacoes")
                );
            }
        }
        return null;
    }

    public List<Prontuario> readAll() throws SQLException {
        String sql = "SELECT * FROM prontuario";
        List<Prontuario> prontuarios = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                prontuarios.add(new Prontuario(
                        rs.getLong("id"),
                        rs.getString("receituario"),
                        rs.getString("exames"),
                        rs.getString("observacoes")
                ));
            }
        }
        return prontuarios;
    }

    public void update(Prontuario prontuario) throws SQLException {
        String sql = "UPDATE prontuario SET receituario = ?, exames = ?, observacoes = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, prontuario.getReceituario());
            stmt.setString(2, prontuario.getExames());
            stmt.setString(3, prontuario.getObservacoes());
            stmt.setLong(4, prontuario.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM prontuario WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}