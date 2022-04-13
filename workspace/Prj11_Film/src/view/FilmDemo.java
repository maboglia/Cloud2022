package view;

import java.util.Arrays;
import java.util.List;

import controller.FilmController;
import model.Film;

public class FilmDemo {

	public static void main(String[] args) {
		
		Film f = new Film(1, "Space Jam", 4.99, Arrays.asList("Animazione","Sportivo"));// per i generi li passiamo tramite il metodo asList, della classe Arrays
		FilmController.addFilm(f); 			// bisogna che il metodo per creare gli oggetti stia prima del metodo per aggiungere i film
		
		
		List<Film> anime = Arrays.asList
				(f,
						new Film (2, "Roger Rabbit", 5.99, Arrays.asList("Animazione","Commedia")),
						new Film (3, "Berserk", 6.99, Arrays.asList("Animazione","Horror")),
						new Film (4, "Baki", 7.99, Arrays.asList("Animazione","Arti marziali"))
						);
		for (Film film : anime) {
			FilmController.addFilm(film);
		}
		
		for (Film film : FilmController.getAll()) {// getAll è un metodo per vedere il magazzino, che è diverso dal accedere veramente al magazzino (essendo private serve il metodo)
			System.out.println(film);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
