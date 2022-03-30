package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

import java.io.IOException;

/**
 * Servlet implementation class ControllerMVC
 */
@WebServlet("/gestione")
public class ControllerMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroMatricola lm = new LibroMatricola();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		lm.addDipendente(new Fattorino("pippo"));
//		lm.addDipendente(new Impiegato("pluto"));
//		lm.addDipendente(new Dirigente("jhonny"));
//		lm.addDipendente(new Fattorino("francesca"));
		
		request.setAttribute("elencoDipendenti", lm.getAll());
		
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("nome")!=null && request.getParameter("ruolo")!=null  ) {
			lm.addDipendente(request.getParameter("nome"), request.getParameter("ruolo"));
//			System.out.println(request.getParameter("nome"));
//			System.out.println(request.getParameter("ruolo"));
		}
		
		
		
		doGet(request, response);
	}

}
