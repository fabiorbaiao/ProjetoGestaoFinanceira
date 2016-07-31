package negocio;

public class Endereco {
	
	private int id;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(){

	}

	public Endereco(int id){
		this.setId(id);
	}
	
	public void exibir(){
		System.out.printf("%s - %s - %s\n",
				this.getBairro(), 
				this.getCidade(), 
				this.getUf());
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
