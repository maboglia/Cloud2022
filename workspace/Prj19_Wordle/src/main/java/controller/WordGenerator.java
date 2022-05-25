package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Word;

import java.io.IOException;

/**
 * Servlet implementation class WordGenerator
 */
@WebServlet("/wordle")
public class WordGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Word secretWord;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WordGenerator() {
        super();
        
        this.secretWord = new Word();
        this.secretWord.genera();
        System.out.println("servlet creata");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("titolo", "Il mio word generator");
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		
		response.getWriter().append("Ciao, sono wordle");
		
		response.getWriter().append(this.secretWord.getParola());

		request.getRequestDispatcher("form_parola.jsp").include(request, response);
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("parolaIndovinata") != null) {
			if (request.getParameter("parolaIndovinata").equals(secretWord.getParola())) {
				System.out.println("hai indovinato!!!!!");
				this.secretWord.genera();//rigenera
			}	
		}
		
		doGet(request, response);
	}

}
