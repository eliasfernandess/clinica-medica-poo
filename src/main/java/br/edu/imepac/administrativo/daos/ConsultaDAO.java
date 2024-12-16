package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Consulta;
import br.edu.imepac.administrativo.entidades.Convenio;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO extends BaseDao {

    public void create(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consulta (dataHorario, sintomas, eRetorno, estaAtiva, convenio_id, prontuario_id, atendente_id, medico_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(consulta.getDataHorario())); // Data e Hora
            stmt.setString(2, consulta.getSintomas()); // Sintomas
            stmt.setBoolean(3, consulta.eRetorno()); // Se é retorno
            stmt.setBoolean(4, consulta.estaAtiva()); // Se está ativa
            stmt.setLong(5, consulta.getConvenioId()); // ID do convênio
            stmt.setLong(6, consulta.getProntuarioId()); // ID do prontuário
            stmt.setLong(7, consulta.getAtendenteId() != null ? consulta.getAtendenteId().getId() : null); // Atendente
            stmt.setLong(8, consulta.getMedicoId() != null ? consulta.getMedicoId().getId() : null); // Médico

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir consulta: " + e.getMessage());
        }
    }

    public Consulta read(Long id) throws SQLException {
        String sql = "SELECT * FROM consulta WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Consulta(
                    rs.getLong("id"),
                    rs.getTimestamp("dataHorario").toLocalDateTime(),
                    rs.getString("sintomas"),
                    rs.getBoolean("eRetorno"),
                    rs.getBoolean("estaAtiva"),
                    rs.getLong("convenio_id"),
                    null, // Convenio
                    rs.getLong("prontuario_id"),
                    null, // Prontuario
                    null, // Atendente
                    null, // Atendente
                    null, // Médico
                    null  // Médico
                );
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar consulta: " + e.getMessage());
        }
        return null;
    }

    public List<Consulta> readAll() throws SQLException {
    String sql = "SELECT id, dataHorario, sintomas, eRetorno, estaAtiva, convenio_id, prontuario_id FROM consulta";
    List<Consulta> consultas = new ArrayList<>();

    try (PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            consultas.add(new Consulta(
                rs.getLong("id"),
                rs.getTimestamp("dataHorario").toLocalDateTime(),
                rs.getString("sintomas"),
                rs.getBoolean("eRetorno"),
                rs.getBoolean("estaAtiva"),
                rs.getLong("convenio_id"),
                null, // Convenio - opcional
                rs.getLong("prontuario_id"),
                null, // Prontuario - opcional
                null, null, null, null // Outros atributos opcionais
            ));
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao listar consultas: " + e.getMessage());
    }
    return consultas;
}


    public void update(Consulta consulta) throws SQLException {
    String sql = "UPDATE consulta SET dataHorario = ?, sintomas = ?, eRetorno = ?, estaAtiva = ?, convenio_id = ?, prontuario_id = ?, atendente_id = ?, medico_id = ? WHERE id = ?";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setTimestamp(1, Timestamp.valueOf(consulta.getDataHorario()));
        stmt.setString(2, consulta.getSintomas());
        stmt.setBoolean(3, consulta.eRetorno());
        stmt.setBoolean(4, consulta.estaAtiva());

        // Verificação para convenio_id
        if (consulta.getConvenioId() != null) {
            stmt.setLong(5, consulta.getConvenioId());
        } else {
            stmt.setNull(5, Types.BIGINT);
        }

        // Verificação para prontuario_id
        if (consulta.getProntuarioId() != null) {
            stmt.setLong(6, consulta.getProntuarioId());
        } else {
            stmt.setNull(6, Types.BIGINT);
        }

        // Verificação para atendente_id
        if (consulta.getAtendenteId() != null) {
            stmt.setLong(7, consulta.getAtendenteId().getId());
        } else {
            stmt.setNull(7, Types.BIGINT);
        }

        // Verificação para medico_id
        if (consulta.getMedicoId() != null) {
            stmt.setLong(8, consulta.getMedicoId().getId());
        } else {
            stmt.setNull(8, Types.BIGINT);
        }

        stmt.setLong(9, consulta.getId());

        stmt.executeUpdate();
    } catch (SQLException e) {
        throw new SQLException("Erro ao atualizar consulta: " + e.getMessage());
    }
}


    public List<Convenio> listarConvenios() throws SQLException {
    String sql = "SELECT id_conv, nome_conv FROM convenio"; // Nomes exatos das colunas
    List<Convenio> convenios = new ArrayList<>();

    try (PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            Convenio convenio = new Convenio();
            convenio.setId(rs.getInt("id_conv")); // id_conv é a chave primária
            convenio.setNomeConvenio(rs.getString("nome_conv")); // nome_conv é o nome do convênio
            convenios.add(convenio);
        }
    } catch (SQLException e) { // Debug no console
        // Debug no console
        throw new SQLException("Erro ao carregar convênios: " + e.getMessage());
    }

    return convenios;
}


    public List<String> listarProntuarios() throws SQLException {
        String sql = "SELECT id, descricao FROM prontuario";
        List<String> prontuarios = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                prontuarios.add(rs.getLong("id") + " - " + rs.getString("descricao"));
            }
        }
        return prontuarios;
    }
}
