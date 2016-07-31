package negocio;

public abstract class Entidade {

	private String nome;
	private Contato contato;
	
	public void exibir(){
		System.out.printf("%s\n", 
				this.getNome());
		
		this.getContato().exibir();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
