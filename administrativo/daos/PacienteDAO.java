package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    private Connection conn;

    public PacienteDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Paciente Paciente) throws SQLException {
        String sql = "INSERT INTO Paciente (nome,nascimento, sexo, cpf,"
                + " cep, uf, cidade,) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Paciente.getnome());
            stmt.setDate(2, (Date) Paciente.getnascimento());
            stmt.setString(3, Paciente.getsexo());
            stmt.setString(4, Paciente.getcpf());
            stmt.setString(5, Paciente.getcep());
            stmt.setString(6, Paciente.getuf());           
            stmt.setString(7, Paciente.getcidade());
            stmt.setInt(8, Paciente.getid());



         
            stmt.executeUpdate();
        }
    }

   
    public List<Paciente> buscarTodos() throws SQLException {
        String sql = "SELECT * FROM Paciente";
        List<Paciente> pacientes = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setid(rs.getInt("id"));
                paciente.setnome(rs.getString("nome"));
                paciente.setnascimento(rs.getDate("nascimento"));
                paciente.setsexo(rs.getString("sexo"));
                paciente.setcpf(rs.getString("cpf"));
                paciente.setcep(rs.getString("cep"));
                paciente.setuf(rs.getString("uf"));
                paciente.setcidade(rs.getString("cidade"));

                pacientes.add(paciente);
            }
        }

        return pacientes;
    }

    public Paciente buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM Paciente WHERE id = ?";
        Paciente pacientes = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    pacientes = new Paciente();
                    pacientes.setid(rs.getInt("id"));
                    pacientes.setnome(rs.getString("nome"));
                    pacientes.setnascimento(rs.getDate("nascimento"));
                    pacientes.setsexo(rs.getString("sexo"));
                    pacientes.setcpf(rs.getString("cpf"));
                    pacientes.setcep(rs.getString("cep"));
                    pacientes.setuf(rs.getString("uf"));
                    pacientes.setcidade(rs.getString("cidade"));

                }
            }
        }

        return pacientes;
    }

    public void atualizar(Paciente paciente) throws SQLException {
        String sql = "UPDATE Paciente SET nome = "
                + "?, sexo = ?, cpf = ?, cep = ?,"
                + " uf = ?, cidade = ?, nascimento = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getnome());
            stmt.setString(2, paciente.getsexo());
            stmt.setString(3, paciente.getcpf());
            stmt.setString(4, paciente.getcep());
            stmt.setString(5, paciente.getuf());
            stmt.setString(6, paciente.getcidade());
            stmt.setDate(7, new java.sql.Date(paciente.getnascimento().getTime()));
            stmt.setInt(8, paciente.getid());

            stmt.executeUpdate();
        }
    }

    //
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Paciente WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
