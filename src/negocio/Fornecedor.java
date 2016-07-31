package negocio;

public class Fornecedor extends Entidade {

	private String cnpj;
	
	public void exibir(){
		System.out.printf("%s",
				this.getCnpj());
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
