package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Consulta;
import br.edu.imepac.administrativo.entidades.Convenio;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO extends BaseDao {

    public void create(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consulta (data_horario, sintomas, e_retorno, esta_ativa, convenio_id, prontuario_id, atendente_id, medico_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(consulta.getDataHorario()));
            stmt.setString(2, consulta.getSintomas());
            stmt.setBoolean(3, consulta.eRetorno());
            stmt.setBoolean(4, consulta.estaAtiva());
            stmt.setLong(5, consulta.getConvenioId());
            stmt.setLong(6, consulta.getProntuarioId());
            stmt.setLong(7, consulta.getAtendenteId().getId());
            stmt.setLong(8, consulta.getMedicoId().getId());
            stmt.executeUpdate();
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
                        rs.getTimestamp("data_horario").toLocalDateTime(),
                        rs.getString("sintomas"),
                        rs.getBoolean("e_retorno"),
                        rs.getBoolean("esta_ativa"),
                        rs.getLong("convenio_id"),
                        null, // Placeholder for loaded Convenio object
                        rs.getLong("prontuario_id"),
                        null, // Placeholder for loaded Prontuario object
                        null, // Placeholder for loaded Funcionario object
                        null, // Placeholder for loaded Funcionario object
                        null, // Placeholder for loaded Funcionario object
                        null // Placeholder for loaded Funcionario object
                );
            }
        }
        return null;
    }

    public List<Consulta> readAll() throws SQLException {
        String sql = "SELECT * FROM consulta";
        List<Consulta> consultas = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                consultas.add(new Consulta(
                        rs.getLong("id"),
                        rs.getTimestamp("data_horario").toLocalDateTime(),
                        rs.getString("sintomas"),
                        rs.getBoolean("e_retorno"),
                        rs.getBoolean("esta_ativa"),
                        rs.getLong("convenio_id"),
                        null, // Placeholder for loaded Convenio object
                        rs.getLong("prontuario_id"),
                        null, // Placeholder for loaded Prontuario object
                        null, // Placeholder for loaded Funcionario object
                        null, // Placeholder for loaded Funcionario object
                        null, // Placeholder for loaded Funcionario object
                        null // Placeholder for loaded Funcionario object
                ));
            }
        }
        return consultas;
    }

    public void update(Consulta consulta) throws SQLException {
        String sql = "UPDATE consulta SET data_horario = ?, sintomas = ?, e_retorno = ?, esta_ativa = ?, convenio_id = ?, prontuario_id = ?, atendente_id = ?, medico_id = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(consulta.getDataHorario()));
            stmt.setString(2, consulta.getSintomas());
            stmt.setBoolean(3, consulta.eRetorno());
            stmt.setBoolean(4, consulta.estaAtiva());
            stmt.setLong(5, consulta.getConvenioId());
            stmt.setLong(6, consulta.getProntuarioId());
            stmt.setLong(7, consulta.getAtendenteId().getId());
            stmt.setLong(8, consulta.getMedicoId().getId());
            stmt.setLong(9, consulta.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM consulta WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
    
    public List<Convenio> listarConvenios() throws SQLException {
        String sql = "SELECT id, nomeConvenio FROM convenio";
        List<Convenio> convenios = new ArrayList<>();
        
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Convenio convenio = new Convenio();
                convenio.setId((int) rs.getLong("id"));
                convenio.setNomeConvenio(rs.getString("nomeConvenio"));
                convenios.add(convenio);
            }
        }
        return convenios;
    }

    public void salvarConsulta(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consulta (dataHorario, sintomas, eRetorno, estaAtiva, convenioId, prontuarioId) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Configura os parâmetros da consulta SQL
            stmt.setTimestamp(1, Timestamp.valueOf(consulta.getDataHorario())); // Data e Hora
            stmt.setString(2, consulta.getSintomas()); // Sintomas
            stmt.setBoolean(3, consulta.eRetorno()); // Se é retorno
            stmt.setBoolean(4, consulta.estaAtiva()); // Se está ativa
            stmt.setLong(5, consulta.getConvenioId()); // ID do convênio
            stmt.setLong(6, consulta.getProntuarioId()); // ID do prontuário

            // Executa o comando SQL
            stmt.executeUpdate();
        }
    }
}

