package programma;

import java.util.Scanner;

public class Registro {

	Studente[] studenti;

	public Registro(Studente[] studenti) {
		this.studenti = studenti;
	}
	
	
	/**
	 * Metodo che ritorna il numero di studenti nel registro
	 * @return
	 */
	public int getNumeroStudenti() {
		return this.studenti.length;
	}
	
	public int faiAppello() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente?");
			System.out.println(studente.stampa());
			
			if (sc.nextLine().equals("s")) {
				i++;
			}
		}
		
		return i;
		
		
	}
	
	
}
