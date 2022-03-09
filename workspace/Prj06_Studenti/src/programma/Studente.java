package programma;

public class Studente {

	int nMatricola;
	String nome;
	String cognome;

	
	/**
	 * Costruttore dello <b>Studente</b>, metodo che serve per costruire oggetti di tipo studente 
	 * 
	 * @param nMatricola Inserire il numero di matricola
	 * @param nome Scrivi il nome dello studente
	 * @param cognome Scrivi il cognome dello studente
	 */
	public Studente(int nMatricola, String nome, String cognome) {

		this.nMatricola = nMatricola;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	/**
	 * Chiama questo metodo per avere una versione a stringa di <b>QUESTO</b> studente 
	 * @return Ritorna una stringa che rappresenta <b>this</b> studente 
	 */
	public String stampa() {
		return "Studente: " + nome + " " + cognome;
	}
	
	
}
