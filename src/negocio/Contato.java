package negocio;

public class Contato {

	private String email;
	private String telefone;
	private String webPage;
	
	public void exibir(){
		System.out.printf("%s - %s - %s\n",
				this.getEmail(),
				this.getTelefone(),
				this.getWebPage());
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getWebPage() {
		return webPage;
	}
	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
}
