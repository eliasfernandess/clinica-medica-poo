
package br.edu.imepac.administrativo.daos;

import edu.br.com.imepac.entidades.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao extends GenericDao {

    public void save(Paciente paciente) {
        String sql = "INSERT INTO pacientes (nome, sexo, rua, cpf, numero, complemento, bairro, estado, contato, email, data_nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getSexo());
            stmt.setString(3, paciente.getRua());
            stmt.setString(4, paciente.getCpf());
            stmt.setInt(5, paciente.getNumero());
            stmt.setString(6, paciente.getComplemento());
            stmt.setString(7, paciente.getBairro());
            stmt.setString(8, paciente.getEstado());
            stmt.setString(9, paciente.getContato());
            stmt.setString(10, paciente.getEmail());
            stmt.setDate(11, paciente.getDataNascimento());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Paciente> getAll() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM pacientes";
        try {
            Connecti on conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setRua(rs.getString("rua"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNumero(rs.getInt("numero"));
                paciente.setComplemento(rs.getString("complemento"));
                paciente.setBairro(rs.getString("bairro"));
                paciente.setEstado(rs.getString("estado"));
                paciente.setContato(rs.getString("contato"));
                paciente.setEmail(rs.getString("email"));
                paciente.setDataNascimento(rs.getDate("data_nascimento"));
                pacientes.add(paciente);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

    public void delete(long pacienteId) {
        String sql = "DELETE FROM pacientes WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, pacienteId);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Paciente paciente) {
        String sql = "UPDATE pacientes SET nome = ?, sexo = ?, rua = ?, cpf = ?, numero = ?, complemento = ?, bairro = ?, estado = ?, contato = ?, email = ?, data_nascimento = ? WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getSexo());
            stmt.setString(3, paciente.getRua());
            stmt.setString(4, paciente.getCpf());
            stmt.setInt(5, paciente.getNumero());
            stmt.setString(6, paciente.getComplemento());
            stmt.setString(7, paciente.getBairro());
            stmt.setString(8, paciente.getEstado());
            stmt.setString(9, paciente.getContato());
            stmt.setString(10, paciente.getEmail());
            stmt.setDate(11, paciente.getDataNascimento());
            stmt.setLong(12, paciente.getId());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Paciente getById(long pacienteId) {
        Paciente paciente = new Paciente();
        String sql = "SELECT * FROM pacientes WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, pacienteId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setRua(rs.getString("rua"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNumero(rs.getInt("numero"));
                paciente.setComplemento(rs.getString("complemento"));
                paciente.setBairro(rs.getString("bairro"));
                paciente.setEstado(rs.getString("estado"));
                paciente.setContato(rs.getString("contato"));
                paciente.setEmail(rs.getString("email"));
                paciente.setDataNascimento(rs.getDate("data_nascimento"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }
}
