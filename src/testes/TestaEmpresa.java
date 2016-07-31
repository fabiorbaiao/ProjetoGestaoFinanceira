package testes;

import negocio.Empresa;
import negocio.Endereco;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("nome fantasia");
		empresa.setRazaoSocial("razao social");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("bairro");
		endereco.setCidade("cidade");
		endereco.setUf("uf");
		
		empresa.setEndereco(endereco);
		
		empresa.exibir();
	}
}
