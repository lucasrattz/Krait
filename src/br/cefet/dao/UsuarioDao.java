package br.cefet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cefet.model.Usuario;

public class UsuarioDao {
	
	private Connection con;
	
	public UsuarioDao() {
		con = ConnectionFactory.getConnection();
	}
	
	public void add(Usuario usuario) throws SQLException {
		String sql = "insert into usuario (nome, login, senha) " + " values (?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getLogin());
		stmt.setString(3, usuario.getSenha());
		
		stmt.execute();                                                    
		stmt.close();
		con.close();
		
	}
}
