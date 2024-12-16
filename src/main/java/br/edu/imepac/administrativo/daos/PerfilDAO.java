package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Perfil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PerfilDAO extends BaseDao {

    public void create(Perfil perfil) throws SQLException {
        String sql = "INSERT INTO perfil (nome, cadastrar_funcionario, ler_funcionario, atualizar_funcionario, deletar_funcionario, listar_funcionario, cadastrar_paciente, ler_paciente, atualizar_paciente, deletar_paciente, listar_paciente, cadastrar_consulta, ler_consulta, atualizar_consulta, deletar_consulta, listar_consulta, cadastrar_especialidade, ler_especialidade, atualizar_especialidade, deletar_especialidade, listar_especialidade, cadastrar_convenio, ler_convenio, atualizar_convenio, deletar_convenio, listar_convenio, cadastrar_prontuario, ler_prontuario, atualizar_prontuario, deletar_prontuario, listar_prontuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, perfil.getNome());
            stmt.setBoolean(2, perfil.isCadastrarFuncionario());
            stmt.setBoolean(3, perfil.isLerFuncionario());
            stmt.setBoolean(4, perfil.isAtualizarFuncionario());
            stmt.setBoolean(5, perfil.isDeletarFuncionario());
            stmt.setBoolean(6, perfil.isListarFuncionario());
            stmt.setBoolean(7, perfil.isCadastrarPaciente());
            stmt.setBoolean(8, perfil.isLerPaciente());
            stmt.setBoolean(9, perfil.isAtualizarPaciente());
            stmt.setBoolean(10, perfil.isDeletarPaciente());
            stmt.setBoolean(11, perfil.isListarPaciente());
            stmt.setBoolean(12, perfil.isCadastrarConsulta());
            stmt.setBoolean(13, perfil.isLerConsulta());
            stmt.setBoolean(14, perfil.isAtualizarConsulta());
            stmt.setBoolean(15, perfil.isDeletarConsulta());
            stmt.setBoolean(16, perfil.isListarConsulta());
            stmt.setBoolean(17, perfil.isCadastrarEspecialidade());
            stmt.setBoolean(18, perfil.isLerEspecialidade());
            stmt.setBoolean(19, perfil.isAtualizarEspecialidade());
            stmt.setBoolean(20, perfil.isDeletarEspecialidade());
            stmt.setBoolean(21, perfil.isListarEspecialidade());
            stmt.setBoolean(22, perfil.isCadastrarConvenio());
            stmt.setBoolean(23, perfil.isLerConvenio());
            stmt.setBoolean(24, perfil.isAtualizarConvenio());
            stmt.setBoolean(25, perfil.isDeletarConvenio());
            stmt.setBoolean(26, perfil.isListarConvenio());
            stmt.setBoolean(27, perfil.isCadastrarProntuario());
            stmt.setBoolean(28, perfil.isLerProntuario());
            stmt.setBoolean(29, perfil.isAtualizarProntuario());
            stmt.setBoolean(30, perfil.isDeletarProntuario());
            stmt.setBoolean(31, perfil.isListarProntuario());
            stmt.executeUpdate();
        }
    }

    public Perfil read(Long id) throws SQLException {
        String sql = "SELECT * FROM perfil WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Perfil(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getBoolean("cadastrar_funcionario"),
                        rs.getBoolean("ler_funcionario"),
                        rs.getBoolean("atualizar_funcionario"),
                        rs.getBoolean("deletar_funcionario"),
                        rs.getBoolean("listar_funcionario"),
                        rs.getBoolean("cadastrar_paciente"),
                        rs.getBoolean("ler_paciente"),
                        rs.getBoolean("atualizar_paciente"),
                        rs.getBoolean("deletar_paciente"),
                        rs.getBoolean("listar_paciente"),
                        rs.getBoolean("cadastrar_consulta"),
                        rs.getBoolean("ler_consulta"),
                        rs.getBoolean("atualizar_consulta"),
                        rs.getBoolean("deletar_consulta"),
                        rs.getBoolean("listar_consulta"),
                        rs.getBoolean("cadastrar_especialidade"),
                        rs.getBoolean("ler_especialidade"),
                        rs.getBoolean("atualizar_especialidade"),
                        rs.getBoolean("deletar_especialidade"),
                        rs.getBoolean("listar_especialidade"),
                        rs.getBoolean("cadastrar_convenio"),
                        rs.getBoolean("ler_convenio"),
                        rs.getBoolean("atualizar_convenio"),
                        rs.getBoolean("deletar_convenio"),
                        rs.getBoolean("listar_convenio"),
                        rs.getBoolean("cadastrar_prontuario"),
                        rs.getBoolean("ler_prontuario"),
                        rs.getBoolean("atualizar_prontuario"),
                        rs.getBoolean("deletar_prontuario"),
                        rs.getBoolean("listar_prontuario")
                );
            }
        }
        return null;
    }

    public List<Perfil> readAll() throws SQLException {
        String sql = "SELECT * FROM perfil";
        List<Perfil> perfis = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                perfis.add(new Perfil(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getBoolean("cadastrar_funcionario"),
                        rs.getBoolean("ler_funcionario"),
                        rs.getBoolean("atualizar_funcionario"),
                        rs.getBoolean("deletar_funcionario"),
                        rs.getBoolean("listar_funcionario"),
                        rs.getBoolean("cadastrar_paciente"),
                        rs.getBoolean("ler_paciente"),
                        rs.getBoolean("atualizar_paciente"),
                        rs.getBoolean("deletar_paciente"),
                        rs.getBoolean("listar_paciente"),
                        rs.getBoolean("cadastrar_consulta"),
                        rs.getBoolean("ler_consulta"),
                        rs.getBoolean("atualizar_consulta"),
                        rs.getBoolean("deletar_consulta"),
                        rs.getBoolean("listar_consulta"),
                        rs.getBoolean("cadastrar_especialidade"),
                        rs.getBoolean("ler_especialidade"),
                        rs.getBoolean("atualizar_especialidade"),
                        rs.getBoolean("deletar_especialidade"),
                        rs.getBoolean("listar_especialidade"),
                        rs.getBoolean("cadastrar_convenio"),
                        rs.getBoolean("ler_convenio"),
                        rs.getBoolean("atualizar_convenio"),
                        rs.getBoolean("deletar_convenio"),
                        rs.getBoolean("listar_convenio"),
                        rs.getBoolean("cadastrar_prontuario"),
                        rs.getBoolean("ler_prontuario"),
                        rs.getBoolean("atualizar_prontuario"),
                        rs.getBoolean("deletar_prontuario"),
                        rs.getBoolean("listar_prontuario")
                ));
            }
        }
        return perfis;
    }

    public void update(Perfil perfil) throws SQLException {
        String sql = "UPDATE perfil SET nome = ?, cadastrar_funcionario = ?, ler_funcionario = ?, atualizar_funcionario = ?, deletar_funcionario = ?, listar_funcionario = ?, cadastrar_paciente = ?, ler_paciente = ?, atualizar_paciente = ?, deletar_paciente = ?, listar_paciente = ?, cadastrar_consulta = ?, ler_consulta = ?, atualizar_consulta = ?, deletar_consulta = ?, listar_consulta = ?, cadastrar_especialidade = ?, ler_especialidade = ?, atualizar_especialidade = ?, deletar_especialidade = ?, listar_especialidade = ?, cadastrar_convenio = ?, ler_convenio = ?, atualizar_convenio = ?, deletar_convenio = ?, listar_convenio = ?, cadastrar_prontuario = ?, ler_prontuario = ?, atualizar_prontuario = ?, deletar_prontuario = ?, listar_prontuario = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, perfil.getNome());
            stmt.setBoolean(2, perfil.isCadastrarFuncionario());
            stmt.setBoolean(3, perfil.isLerFuncionario());
            stmt.setBoolean(4, perfil.isAtualizarFuncionario());
            stmt.setBoolean(5, perfil.isDeletarFuncionario());
            stmt.setBoolean(6, perfil.isListarFuncionario());
            stmt.setBoolean(7, perfil.isCadastrarPaciente());
            stmt.setBoolean(8, perfil.isLerPaciente());
            stmt.setBoolean(9, perfil.isAtualizarPaciente());
            stmt.setBoolean(10, perfil.isDeletarPaciente());
            stmt.setBoolean(11, perfil.isListarPaciente());
            stmt.setBoolean(12, perfil.isCadastrarConsulta());
            stmt.setBoolean(13, perfil.isLerConsulta());
            stmt.setBoolean(14, perfil.isAtualizarConsulta());
            stmt.setBoolean(15, perfil.isDeletarConsulta());
            stmt.setBoolean(16, perfil.isListarConsulta());
            stmt.setBoolean(17, perfil.isCadastrarEspecialidade());
            stmt.setBoolean(18, perfil.isLerEspecialidade());
            stmt.setBoolean(19, perfil.isAtualizarEspecialidade());
            stmt.setBoolean(20, perfil.isDeletarEspecialidade());
            stmt.setBoolean(21, perfil.isListarEspecialidade());
            stmt.setBoolean(22, perfil.isCadastrarConvenio());
            stmt.setBoolean(23, perfil.isLerConvenio());
            stmt.setBoolean(24, perfil.isAtualizarConvenio());
            stmt.setBoolean(25, perfil.isDeletarConvenio());
            stmt.setBoolean(26, perfil.isListarConvenio());
            stmt.setBoolean(27, perfil.isCadastrarProntuario());
            stmt.setBoolean(28, perfil.isLerProntuario());
            stmt.setBoolean(29, perfil.isAtualizarProntuario());
            stmt.setBoolean(30, perfil.isDeletarProntuario());
            stmt.setBoolean(31, perfil.isListarProntuario());
            stmt.setLong(32, perfil.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM perfil WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
