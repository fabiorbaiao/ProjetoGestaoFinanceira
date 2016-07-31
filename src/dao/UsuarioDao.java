package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import negocio.Usuario;

public class UsuarioDao {

	public static Usuario obterUsuario(String login, String senha){
		
		Usuario usuario = new Usuario();
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("select * from usuario where login = ? and senha = ?");
			ps.setString(1, login);
			ps.setString(2, senha);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if (rs.next()){
				usuario.setId(rs.getInt("id"));
				usuario.setEmail(rs.getString("email")); 
				usuario.setLogin(rs.getString("login")); 
				usuario.setSenha(rs.getString("senha")); 
				usuario.setNome(rs.getString("nome"));

				usuario.setEndereco(EnderecoDao.obterEndereco(rs.getInt("idEndereco")));				

				usuario.setEmpresa(EmpresaDao.obterEmpresaPorUsuario(usuario));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public static Usuario obterUsuario(int id){
		Usuario usuario = null;
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("SELECT id, nome, login, senha, email FROM usuario WHERE id = ?");
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if (rs.next()){
				usuario = new Usuario();
				usuario.setId(id);
				usuario.setNome(rs.getString("nome")); 
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	public static boolean incluir(Usuario usuario){
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getEmail());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
	
	public static boolean alterar(Usuario usuario){
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("UPDATE usuario SET nome = ?, login = ?, senha = ?, email = ? WHERE id = ?");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getEmail());
			ps.setInt(5, usuario.getId());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
	
	public static boolean excluir(Usuario usuario){
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("DELETE FROM usuario WHERE id = ?");
			ps.setInt(1, usuario.getId());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}	
	
	public static List<Usuario> obterLista(){
		String sql = "SELECT id, nome, login, senha, email FROM  usuario ORDER BY nome";
		
		List<Usuario> usuarios = null;
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement(sql);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			usuarios = new ArrayList<Usuario>();
			
			while(rs.next()){
				usuarios.add(
						new Usuario(
								rs.getInt("id"), 
								rs.getString("nome"),
								rs.getString("email"),
								rs.getString("login"),
								rs.getString("senha")								
								));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}	
}
