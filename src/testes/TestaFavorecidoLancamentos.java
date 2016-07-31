package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Favorecido;
import negocio.Fornecedor;
import negocio.Lancamento;

public class TestaFavorecidoLancamentos {

	public static void main(String[] args) {
		
		Fornecedor ampla = new Fornecedor();
		
		Fornecedor empresa = new Fornecedor();
		
		Lancamento lanca1 = new Lancamento();
		lanca1.setValor(1000);
		lanca1.setTipo("D");
		lanca1.setEntidade(ampla);
		
		Lancamento lanca2 = new Lancamento();
		lanca2.setValor(5000);
		lanca2.setTipo("C");
		lanca2.setEntidade(empresa);
		
		Lancamento lanca3 = new Lancamento();
		lanca3.setValor(300);
		lanca3.setTipo("D");
		lanca3.setEntidade(ampla);

		List<Lancamento> listaLancamento = new ArrayList<Lancamento>();
		
		listaLancamento.add(lanca1);
		listaLancamento.add(lanca2);
		listaLancamento.add(lanca3);
		
		Favorecido elberth = new Favorecido();
		
		elberth.setLancamentos(listaLancamento);
		
		System.out.printf("Saldo = %.2f",
				elberth.calcularSaldo());		
	}
}