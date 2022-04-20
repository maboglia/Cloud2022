package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ScienziatoService;

import java.io.IOException;

import org.json.JSONArray;

/**
 * Servlet implementation class ScienziatiMVC
 */
@WebServlet("/api")
public class ScienziatiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ScienziatoService service;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScienziatiREST() {
        super();
        this.service = new ScienziatoService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONArray array = new JSONArray(this.service.getAll());
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
