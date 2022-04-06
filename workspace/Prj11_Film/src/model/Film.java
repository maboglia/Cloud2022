package model; // il model è come le entità dei DB

import java.util.List;

public class Film {

	private int codice;
	private String titolo;
	private double prezzo;
	private List<String> genere;
	
	/**
	 * Costruttore. Per esportare i commenti javadoc come HTML andare su file->export->java->javadoc
	 * @param codice
	 * @param titolo
	 * @param prezzo
	 * @param genere
	 */
	public Film(int codice, String titolo, double prezzo, List<String> genere) {
		this.codice = codice;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.genere = genere;
	}

	public int getCodice() {// i metodi getters servono a leggere le proprietà degli oggetti. Ad es: un tachimetro per velocità
		return codice;
	}

	public void setCodice(int codice) {// i setters a modificarle. Ad es: il cruise control per settare la velocità. I metodì però possono avere un range. Tipo velocità tra 1 e 200 kmh
		this.codice = codice;
	}

	public String getTitolo() {// non attribuire un metodo getter o setter può evitare che si leggano o manipolino proprietà
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<String> getGenere() {
		return genere;
	}

	public void setGenere(List<String> genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {// Il ToString serve a trasformare l' oggetto in una stringa
		StringBuilder builder = new StringBuilder();//string builder è un oggetto specializzato nel costruire stringhe, 
		builder.append("Film [codice=");			//evoluzione di string buffer, tiene in memoria solo 1 oggetto stringa
		builder.append(codice);					    //che poi può ingrandirsi. Concatenando le stringhe invece creo più
		builder.append(", titolo=");			    //oggetti
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", genere=");
		builder.append(genere);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
// OVERLOAD -> Poter cambiare gli argomenti di un metodo e riutilizzarlo mantenendo sia nome che corpo
// OVERRIDE -> Poter cambiare il corpo del metodo e riutilizzarlo mantenendo il nome e gli argomenti

