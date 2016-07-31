package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.omg.CORBA.Request;

import conexao.Conexao;
import negocio.Empresa;
import negocio.Usuario;

public class EmpresaDao {

	public static Empresa obterEmpresaPorUsuario(Usuario usuario){
		
		return obterEmpresaPorUsuario(usuario.getId());
	}
	
	public static Empresa obterEmpresaPorUsuario(int id){
		
		Empresa empresa = null;
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.obterConexao().prepareStatement("SELECT * FROM empresasusuario e, empresa u WHERE e.idEmpresa = u.id and e.idUsuario = ?");
			ps.setInt(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if (rs.next()){
				empresa = new Empresa();
				empresa.setId(rs.getInt("id"));
				empresa.setNomeFantasia(rs.getString("nomeFantasia")); 
				empresa.setRazaoSocial(rs.getString("razaoSocial"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empresa;
	}	
}