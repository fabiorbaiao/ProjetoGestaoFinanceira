package negocio;

public class Banco {

	private String nome;
	private String agencia;
	private String conta;
	private String tipo;
	
	public void exibir(){
		System.out.printf("%s - %s - %s - %s\n",
				this.getNome(),
				this.getAgencia(),
				this.getConta(),
				this.getTipo());		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
