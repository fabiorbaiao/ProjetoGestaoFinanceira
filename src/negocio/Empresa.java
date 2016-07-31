package negocio;

import java.util.List;

public class Empresa {

	private int id;
	private String nomeFantasia;
	private String razaoSocial;
	private Endereco endereco;
	private List<Usuario> usuarios;
	
	public void exibir(){
		System.out.printf("%s - %s - %s", 
				this.getNomeFantasia(), 
				this.getRazaoSocial());
		this.getEndereco().exibir();
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}