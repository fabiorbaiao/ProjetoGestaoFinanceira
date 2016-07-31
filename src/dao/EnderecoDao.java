package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import negocio.Endereco;
import negocio.Usuario;

public class EnderecoDao {

	public static Endereco obterEndereco(int id){
		
		Endereco endereco = new Endereco();
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("select * from endereco where id = ?");
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if (rs.next()){
				endereco.setId(rs.getInt("id"));
				endereco.setBairro(rs.getString("bairro")); 
				endereco.setCidade(rs.getString("cidade")); 
				endereco.setUf(rs.getString("uf")); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return endereco;
	}

	public static Endereco obterEndereco(Usuario usuario){
		
		return obterEndereco(usuario.getEndereco().getId());
	}
}
