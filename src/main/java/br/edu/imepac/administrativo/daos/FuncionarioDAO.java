package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO extends BaseDao {

    public void create(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (usuario, senha, nome, idade, sexo, cpf, rua, numero, complemento, bairro, cidade, estado, contato, email, data_nascimento, tipo_funcionario, especialidade_id, perfil_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

try (PreparedStatement stmt = connection.prepareStatement(sql)) {
    stmt.setString(1, funcionario.getUsuario());
    stmt.setInt(2, funcionario.getSenha());
    stmt.setString(3, funcionario.getNome());
    stmt.setInt(4, funcionario.getIdade());
    stmt.setString(5, String.valueOf(funcionario.getSexo()));
    stmt.setString(6, funcionario.getCpf());
    stmt.setString(7, funcionario.getRua());
    stmt.setString(8, funcionario.getNumero());
    stmt.setString(9, funcionario.getComplemento());
    stmt.setString(10, funcionario.getBairro());
    stmt.setString(11, funcionario.getCidade());
    stmt.setString(12, funcionario.getEstado());
    stmt.setString(13, funcionario.getContato());
    stmt.setString(14, funcionario.getEmail());
    stmt.setDate(15, Date.valueOf(funcionario.getDataNascimento()));
    stmt.setString(16, funcionario.getTipoFuncionario());
    if (funcionario.getEspecialidadeId() != null) {
        stmt.setLong(17, funcionario.getEspecialidadeId());
    } else {
        stmt.setNull(17, java.sql.Types.BIGINT); // Permite valor nulo para especialidade
    }
    stmt.setLong(18, funcionario.getPerfilId()); // Perfil sempre é obrigatório
    stmt.executeUpdate();
    }
}


    public Funcionario read(Long id) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Funcionario(
                        rs.getLong("id"),
                        rs.getString("usuario"),
                        rs.getInt("senha"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("sexo").charAt(0),
                        rs.getString("cpf"),
                        rs.getString("rua"),
                        rs.getString("numero"),
                        rs.getString("complemento"),
                        rs.getString("bairro"),
                        rs.getString("cidade"),
                        rs.getString("estado"),
                        rs.getString("contato"),
                        rs.getString("email"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getString("tipo_funcionario"),
                        null, null
                );
            }
        }
        return null;
    }

    public List<Funcionario> readAll() throws SQLException {
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> funcionarios = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                funcionarios.add(new Funcionario(
                        rs.getLong("id"),
                        rs.getString("usuario"),
                        rs.getInt("senha"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("sexo").charAt(0),
                        rs.getString("cpf"),
                        rs.getString("rua"),
                        rs.getString("numero"),
                        rs.getString("complemento"),
                        rs.getString("bairro"),
                        rs.getString("cidade"),
                        rs.getString("estado"),
                        rs.getString("contato"),
                        rs.getString("email"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getString("tipo_funcionario"),
                        null, null
                ));
            }
        }
        return funcionarios;
    }

    public void update(Funcionario funcionario) throws SQLException {
    String sql = "UPDATE funcionario SET usuario = ?, senha = ?, nome = ?, idade = ?, sexo = ?, cpf = ?, rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ?, contato = ?, email = ?, data_nascimento = ?, tipo_funcionario = ?, especialidade_id = ?, perfil_id = ? WHERE id = ?";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, funcionario.getUsuario());
        stmt.setInt(2, funcionario.getSenha());
        stmt.setString(3, funcionario.getNome());
        stmt.setInt(4, funcionario.getIdade());
        stmt.setString(5, String.valueOf(funcionario.getSexo()));
        stmt.setString(6, funcionario.getCpf());
        stmt.setString(7, funcionario.getRua());
        stmt.setString(8, funcionario.getNumero());
        stmt.setString(9, funcionario.getComplemento());
        stmt.setString(10, funcionario.getBairro());
        stmt.setString(11, funcionario.getCidade());
        stmt.setString(12, funcionario.getEstado());
        stmt.setString(13, funcionario.getContato());
        stmt.setString(14, funcionario.getEmail());
        stmt.setDate(15, Date.valueOf(funcionario.getDataNascimento()));
        stmt.setString(16, funcionario.getTipoFuncionario());
        if (funcionario.getEspecialidadeId() != null) {
            stmt.setLong(17, funcionario.getEspecialidadeId());
        } else {
            stmt.setNull(17, java.sql.Types.BIGINT);
        }
        stmt.setLong(18, funcionario.getPerfilId());
        stmt.setLong(19, funcionario.getId()); // Certifique-se de que o ID está sendo definido no objeto

        stmt.executeUpdate();
    }
}


    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM funcionario WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }

   public void deleteByName(String nome) throws SQLException {
    String sql = "DELETE FROM funcionario WHERE nome = ?";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, nome); // Define o nome a ser excluído
        stmt.executeUpdate();
    }
}


public Funcionario findByName(String nome) throws SQLException {
    String sql = "SELECT * FROM funcionario WHERE nome = ?";

    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return new Funcionario(
                    rs.getLong("id"),
                    rs.getString("usuario"),
                    rs.getInt("senha"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("sexo").charAt(0),
                    rs.getString("cpf"),
                    rs.getString("rua"),
                    rs.getString("numero"),
                    rs.getString("complemento"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("contato"),
                    rs.getString("email"),
                    rs.getDate("data_nascimento").toLocalDate(),
                    rs.getString("tipo_funcionario"),
                    null, null
            );
        }
    }
    return null; // Retorna null se não encontrar
}
}
