package testes;

import java.util.ArrayList;
import java.util.List;
import negocio.Banco;
import negocio.Contato;
import negocio.Endereco;
import negocio.Favorecido;

public class TestaLancamento {

	public static void main(String[] args) {
		Favorecido elberth = new Favorecido();

		List<Banco> listaBanco = new ArrayList<Banco>();		

		Banco b1 = new Banco();
		b1.setAgencia("aa");
		b1.setConta("ccc");
		b1.setNome("nnn");
		b1.setTipo("tt");

		Banco b2 = new Banco();
		b2.setAgencia("aa");
		b2.setConta("ccc");
		b2.setNome("nnn");
		b2.setTipo("tt");

		Banco b3 = new Banco();
		b3.setAgencia("aa");
		b3.setConta("ccc");
		b3.setNome("nnn");
		b3.setTipo("tt");
		
		listaBanco.add(b1);
		listaBanco.add(b2);
		listaBanco.add(b3);
		
		elberth.setBancos(listaBanco);
		
		Contato contato = new Contato();		
		contato.setEmail("eeee");
		contato.setTelefone("ttt");
		contato.setWebPage("www");
		
		elberth.setContato(contato);
		
		elberth.setCpf("12345678901");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("aaaa");
		endereco.setCidade("dddd");
		endereco.setUf("aaa");
		
		elberth.setEndereco(endereco);
		
		elberth.setNome("Elberth Moraes");		
		elberth.exibir();
	}	
}