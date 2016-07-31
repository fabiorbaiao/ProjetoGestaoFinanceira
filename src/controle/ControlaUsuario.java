package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import negocio.Usuario;


public class ControlaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControlaUsuario() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		
		if(UsuarioDao.incluir(usuario)){
			
			request.setAttribute("msg", "Usuario cadastrado com sucesso!!");
		
		}else{
			
			request.setAttribute("msg", "Usuario não cadastrado!!");
					
		}

		request.getRequestDispatcher("login.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
