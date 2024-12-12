package br.edu.imepac.administrativo.daos;

import br.edu.imepac.administrativo.entidades.Perfil;

 import br.edu.imepac.administrativo.entidades.Perfil;
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.util.ArrayList;
        import java.util.List;

public class PerfilDao extends GenericDao {

    public void save(Perfil perfil) {
        String sql = "INSERT INTO perfis (nome, descricao) VALUES (?, ?)";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, perfil.getNome());
            stmt.setString(2, perfil.getDescricao());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Perfil> getAll() {
        List<Perfil> perfis = new ArrayList<>();
        String sql = "SELECT * FROM perfis";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Perfil perfil = new Perfil();
                perfil.setId(rs.getInt("id"));
                perfil.setNome(rs.getString("nome"));
                perfil.setDescricao(rs.getString("descricao"));
                perfis.add(perfil);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return perfis;
    }

    public void delete(long perfilId) {
        String sql = "DELETE FROM perfis WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, perfilId);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Perfil perfil) {
        String sql = "UPDATE perfis SET nome = ?, descricao = ? WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, perfil.getNome());
            stmt.setString(2, perfil.getDescricao());
            stmt.setLong(3, perfil.getId());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Perfil getById(long perfilId) {
        Perfil perfil = new Perfil();
        String sql = "SELECT * FROM perfis WHERE id = ?";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, perfilId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                perfil.setId(rs.getInt("id"));
                perfil.setNome(rs.getString("nome"));
                perfil.setDescricao(rs.getString("descricao"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return perfil;
    }
}
