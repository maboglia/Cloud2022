package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Scienziato;
import service.ScienziatoService;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ScienziatiMVC
 */
@WebServlet("/mvc")
public class ScienziatiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ScienziatoService service;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScienziatiMVC() {
        super();
        this.service = new ScienziatoService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Scienziato> all = this.service.getAll();
		
		
		response.getWriter().append(all.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
