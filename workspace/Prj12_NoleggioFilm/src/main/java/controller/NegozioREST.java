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

import org.json.JSONArray;

/**
 * Servlet implementation class NegozioMVC
 */
@WebServlet("/api/film")
public class NegozioREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NegozioREST() {
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
		JSONArray listaFilmsJSON = new JSONArray(listaFilms);
		response.getWriter().append(listaFilmsJSON.toString());
		System.out.println("Sono il metodo doGet del controller REST");
	}// restituisce i film se la richiesta è di tipo get

	
	

}
// tentare di chiamare il rest tramite doPost restituisce un erroe 405 di metodo non consentito