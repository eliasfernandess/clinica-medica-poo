package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Paciente;
import br.edu.imepac.administrativo.entidades.Perfil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PerfilDAO {

    private Connection conn;

    // Construtor que recebe a conexão ao banco de dados
    public PerfilDAO(Connection conn) {
        this.conn = conn;
    }

    // Métod
    public void inserir(Perfil Perfil) throws SQLException {
        String sql = "INSERT INTO Perfil (nome, tipo, ) "
                + "VALUES (?, ? )";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Perfil.getnome());
            //stmt.setString(3, Perfil.getdescricao());
            stmt.setString(4, Perfil.gettipo());
            stmt.setInt(8, Perfil.getid());



         
            stmt.executeUpdate();
        }
    }

    // M
    public List<Perfil> buscarTodos() throws SQLException {
        String sql = "SELECT * FROM Perfil";
        List<Perfil> perfils = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Perfil perfil = new Perfil();
                perfil.setid(rs.getInt("id"));
                perfil.setnome(rs.getString("nome"));
             //   perfil.setdescricao(rs.getString("descricao"));
                perfil.settipo(rs.getString("tipo"));
            
                perfils.add(perfil);
            }
        }

        return perfils;
    }

    // Mé
    public Perfil buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM Perfil WHERE id = ?";
        Perfil perfils = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    perfils = new Perfil();
                    perfils.setid(rs.getInt("id"));
                    perfils.setnome(rs.getString("nome"));
                   // perfils.setdescricao(rs.getString("descricao"));
                    perfils.settipo(rs.getString("tipo"));
                 
                }
            }
        }

        return perfils;
    }

    // M
    public void atualizar(Perfil perfil) throws SQLException {
        String sql = "UPDATE Perfil SET nome = "
                + "?, descricao = ?, tipo = ?,"
                + " WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, perfil.getnome());
          //  stmt.setString(2, perfil.getdescricao());
            stmt.setString(3, perfil.gettipo());
            stmt.setInt(4, perfil.getid());

            stmt.executeUpdate();
        }
    }

    
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Perfil WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
