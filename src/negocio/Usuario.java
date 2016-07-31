package negocio;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private Endereco endereco;
	private Empresa empresa;
	
	public Usuario(String nome, String email, String login, String senha){
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(int id, String nome, String email, String login, String senha){
		this(nome, email, login, senha);
		this.id = id;		
	}

	public Usuario() {
	}
	
	public void exibir(){
		System.out.println(
				this.getNome() + " - " + 
				this.getEmail() + " - " + 
				this.getLogin() + " - " + 
				this.getSenha());
		this.getEndereco().exibir();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
