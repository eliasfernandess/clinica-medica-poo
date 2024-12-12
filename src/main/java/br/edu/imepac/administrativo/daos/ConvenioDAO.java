package br.edu.imepac.administrativo.dao;

import br.edu.imepac.administrativo.entidades.Convenio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConvenioDAO {

    private Connection conn;

    // Construtor que recebe a conexão ao banco de dados
    public ConvenioDAO(Connection conn) {
        this.conn = conn;
    }

    // Método para inserir um novo convênio no banco
    public void inserir(Convenio convenio) throws SQLException {
        String sql = "INSERT INTO convenio (nome_conv, cod_conv, descricao_conv, data_inicio_conv, data_termino_conv, status_conv, data_nascimento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, convenio.getNomeConvenio());
            stmt.setInt(2, convenio.getCodigoConvenio());
            stmt.setString(3, convenio.getDescricao());
            stmt.setDate(4, new java.sql.Date(convenio.getDataInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(convenio.getDataFim().getTime()));
            stmt.setBoolean(6, convenio.isStatus());
            stmt.setDate(7, new java.sql.Date(convenio.getDataInicio().getTime())); // Altere para data de nascimento correta

            stmt.executeUpdate();
        }
    }

    // Método para buscar todos os convênios
    public List<Convenio> buscarTodos() throws SQLException {
        String sql = "SELECT * FROM convenio";
        List<Convenio> convenios = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Convenio convenio = new Convenio();
                convenio.setId(rs.getInt("id_conv"));
                convenio.setNomeConvenio(rs.getString("nome_conv"));
                convenio.setCodigoConvenio(rs.getInt("cod_conv"));
                convenio.setDescricao(rs.getString("descricao_conv"));
                convenio.setDataInicio(rs.getDate("data_inicio_conv"));
                convenio.setDataFim(rs.getDate("data_termino_conv"));
                convenio.setStatus(rs.getBoolean("status_conv"));

                convenios.add(convenio);
            }
        }

        return convenios;
    }

    // Método para buscar um convênio por ID
    public Convenio buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM convenio WHERE id_conv = ?";
        Convenio convenio = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    convenio = new Convenio();
                    convenio.setId(rs.getInt("id_conv"));
                    convenio.setNomeConvenio(rs.getString("nome_conv"));
                    convenio.setCodigoConvenio(rs.getInt("cod_conv"));
                    convenio.setDescricao(rs.getString("descricao_conv"));
                    convenio.setDataInicio(rs.getDate("data_inicio_conv"));
                    convenio.setDataFim(rs.getDate("data_termino_conv"));
                    convenio.setStatus(rs.getBoolean("status_conv"));
                }
            }
        }

        return convenio;
    }

    // Método para atualizar um convênio
    public void atualizar(Convenio convenio) throws SQLException {
        String sql = "UPDATE convenio SET nome_conv = ?, cod_conv = ?, descricao_conv = ?, data_inicio_conv = ?, data_termino_conv = ?, status_conv = ? WHERE id_conv = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
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

    // Método para excluir um convênio
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM convenio WHERE id_conv = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
