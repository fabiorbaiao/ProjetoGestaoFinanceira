package negocio;

import java.util.List;

public class Favorecido extends Entidade {

	private Endereco endereco;
	private String cpf;
	private List<Banco> bancos;
	private List<Lancamento> lancamentos;
	
	public float calcularSaldo(){
		
		System.out.printf("QTDE: %d\n",
				this.getLancamentos().size());
		
		float creditos = 0;
		float debitos = 0;
		
		for(Lancamento lancamento : this.getLancamentos()){
		
			if("D".equals(lancamento.getTipo())){

				debitos = debitos + lancamento.getValor(); 
			} else {
				creditos = creditos + lancamento.getValor(); 
			}
			
		}
		
		return creditos - debitos;
	}
	
	public void exibir(){
		super.exibir();

		System.out.printf("%s\n",
				this.getCpf());
		
		this.getEndereco().exibir();
		
		for (Banco banco : this.getBancos()) {
			banco.exibir();
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Banco> getBancos() {
		return bancos;
	}

	public void setBancos(List<Banco> bancos) {
		this.bancos = bancos;
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
}
