package funzionale;

import java.util.List;

public class Regione {

	String nome;
	List<String> comuni;
	int popolazione;
	
	public Regione(String nome, List<String> comuni, int popolazione) {
		this.nome = nome;
		this.comuni = comuni;
		this.popolazione = popolazione;
	}
	
	public void stampa() {
		System.out.println( nome + ": " + popolazione); 
	}
	
}
