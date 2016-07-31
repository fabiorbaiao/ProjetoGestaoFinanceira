package testes;

import negocio.Favorecido;

public class TestaColecao {

	public static void main(String[] args) {

		Favorecido f = new Favorecido();
		f.setNome("zezinho");
		f.setCpf("12345");
		
		f.exibir();
		
		
//		Empresa empresa = new Empresa();
//		
//		Usuario u1 = new Usuario();
//		u1.setNome("ze");
//		
//		Usuario u2 = new Usuario();
//		u2.setNome("maria");
//		
//		List<Usuario> usuarios = new ArrayList<Usuario>();
//		
//		usuarios.add(u1);		
//		usuarios.add(u2);
//	
//		empresa.setUsuarios(usuarios);
//		
//		for(Usuario usuario : empresa.getUsuarios()){
//			
//			System.out.println("Nome: " + usuario.getNome());
//		}
	}
}