package model;

public abstract class Dipendente {

	private static int contatore = 1;//appartiene alla clase
	private int nMatr;//appartiene agli oggetti di tipo Dipendente
	
	protected String nome;
	protected String ruolo;
	
	public Dipendente(String nome) {
		this.nMatr = contatore++;
		this.nome = nome;
	}
	
	public int getnMatr() {
		return nMatr;
	}
	
	public abstract double calcolaStipendio();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [nMatr=");
		builder.append(nMatr);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append(", calcolaStipendio()=");
		builder.append(calcolaStipendio());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
