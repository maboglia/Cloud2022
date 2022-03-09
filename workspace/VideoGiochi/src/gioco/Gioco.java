package gioco;

import java.text.NumberFormat;
import java.util.Locale;

public class Gioco {
	public String nome;
	public String genere;
	public double prezzo;
	
	//metodo costruttore(unico metodo che non ritorna nulla
	public Gioco(String nome, String genere, double prezzo) {
		//this. =questo oggetto che stampo avrà come proprietà il nome, il genere e il prezzo
		this.nome = nome;
		this.genere = genere;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("it"));
		return "Gioco [nome=" + nome + ", genere=" + genere + ", prezzo=" + nf.format(prezzo) + "]";
	}
	
	
	
	
	

}
