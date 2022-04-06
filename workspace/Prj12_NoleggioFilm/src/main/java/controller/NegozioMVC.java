package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Film;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class NegozioMVC
 */
@WebServlet("/film")
public class NegozioMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NegozioMVC() {
        super();
        System.out.println("Creata la servlet NegozioMVC");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Film> listaFilms = FilmController.getAll();
		response.getWriter().append(listaFilms.toString());
		System.out.println("Sono il metodo doGet");
	}// restituisce i film se la richiesta è di tipo get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("titolo") != null) {// il server non risponde se non gli arriva il titolo
			int codice = Integer.parseInt(request.getParameter("codice"));// dato che arrivano stringhe tramite la request, vanno convertite in int tramite metodi di parsing
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			String titolo = request.getParameter("titolo");
			String genere = request.getParameter("genere");
			Film f = new Film(codice, titolo, prezzo, Arrays.asList(genere)); // passiamo la variabile genere non la stringa "genere"
			FilmController.addFilm(f);
			System.out.println("Ho aggiunto il film" + f);
		}
		
		doGet(request, response);		
	}// aggiunge i film al magazzino se la richiesta è di tipo post

}
