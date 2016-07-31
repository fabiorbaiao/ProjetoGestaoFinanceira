package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import negocio.Usuario;

public class ControlaAcesso extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControlaAcesso() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrei no doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = null;
		
		String login = request.getParameter("login");
	
		String senha = request.getParameter("senha");
		
		usuario = UsuarioDao.obterUsuario(login, senha);
		
		PrintWriter out = response.getWriter();

		if(usuario != null){
			
			request.setAttribute("objUsuario", usuario);

			request.getRequestDispatcher("main.jsp").forward(request, response);
			
		} else {
			out.println("Usuário Inexistente!!!<br>");
		}		
	}	
}