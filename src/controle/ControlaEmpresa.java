package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpresaDao;
import dao.UsuarioDao;

public class ControlaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControlaEmpresa() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//int idEmpresa = Integer.valueOf(request.getParameter("idEmpresa"));
		
		request.setAttribute("lista", UsuarioDao.obterLista());

		request.getRequestDispatcher("empresa.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}