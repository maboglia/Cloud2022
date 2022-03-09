package model;

public class Studente {

	private static int contatore = 1;
	
	//tipi primitivi interi: byte 8bit, short16bit, int32, long64
	int nMatricola;

	String nome;
	String cognome;
	
	/**
	 * Metodo Costruttore dell'oggetto di tipo Studente
	 * @param nomeStudente Scrivi il nome dello studente
	 * @param cognomeStudente Scrivi il cognome dello stundte
	 */
	public Studente(String nomeStudente, String cognomeStudente) {
		nome = nomeStudente;
		cognome = cognomeStudente;
		nMatricola = contatore++;
	}
	
	
	String presentaStudente() {
		
		String temp = nMatricola + ") " 
					+ nome.toUpperCase() 
					+ " " + cognome.toUpperCase();

		return temp;
	}
	
}
