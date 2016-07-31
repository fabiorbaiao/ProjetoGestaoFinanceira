package testes;

import conexao.Conexao;
import negocio.Usuario;
import negocio.Endereco;

public class TestaUsuario {

	public static void main(String[] args) {
		
		if(Conexao.obterConexao() == null){
			System.out.println("erro");
		}else{
			System.out.println("sucesso");				
		}

		Usuario u = new Usuario(args[1], args[2], args[3], args[4]);
		
		Endereco end = new Endereco();				

		u.setEndereco(end);
		
		end.setBairro("aaa");
		
		end.setCidade("ccc");
		
		end.setUf("rj");

		u.exibir();
		
		
		
	}
}