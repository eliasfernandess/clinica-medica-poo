package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Convenio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConvenioDAO extends BaseDao {

    public void create(Convenio convenio) throws SQLException {
        String sql = "INSERT INTO convenio (nome_conv, cod_conv, descricao_conv, data_inicio_conv, data_termino_conv, status_conv) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, convenio.getNomeConvenio());
            stmt.setInt(2, convenio.getCodigoConvenio());
            stmt.setString(3, convenio.getDescricao());
            stmt.setDate(4, new java.sql.Date(convenio.getDataInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(convenio.getDataFim().getTime()));
            stmt.setBoolean(6, convenio.isStatus());
            stmt.executeUpdate();
        }
    }

    public Convenio read(int id) throws SQLException {
        String sql = "SELECT * FROM convenio WHERE id_conv = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Convenio(
                        rs.getInt("id_conv"),
                        rs.getString("nome_conv"),
                        rs.getInt("cod_conv"),
                        rs.getString("descricao_conv"),
                        rs.getDate("data_inicio_conv"),
                        rs.getDate("data_termino_conv"),
                        rs.getBoolean("status_conv")
                );
            }
        }
        return null;
    }

    public List<Convenio> readAll() throws SQLException {
        String sql = "SELECT * FROM convenio";
        List<Convenio> convenios = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                convenios.add(new Convenio(
                        rs.getInt("id_conv"),
                        rs.getString("nome_conv"),
                        rs.getInt("cod_conv"),
                        rs.getString("descricao_conv"),
                        rs.getDate("data_inicio_conv"),
                        rs.getDate("data_termino_conv"),
                        rs.getBoolean("status_conv")
                ));
            }
        }
        return convenios;
    }

    public void update(Convenio convenio) throws SQLException {
        String sql = "UPDATE convenio SET nome_conv = ?, cod_conv = ?, descricao_conv = ?, data_inicio_conv = ?, data_termino_conv = ?, status_conv = ? WHERE id_conv = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, convenio.getNomeConvenio());
            stmt.setInt(2, convenio.getCodigoConvenio());
            stmt.setString(3, convenio.getDescricao());
            stmt.setDate(4, new java.sql.Date(convenio.getDataInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(convenio.getDataFim().getTime()));
            stmt.setBoolean(6, convenio.isStatus());
            stmt.setInt(7, convenio.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM convenio WHERE id_conv = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
