package model;

public class Dirigente extends Dipendente {

	private double emolumenti;
	private double premio;
	
	public Dirigente(String nome) {
		super(nome);
		this.ruolo = "dirigente";
	}

	@Override
	public double calcolaStipendio() {
		return emolumenti + premio;
	}

	public double getEmolumenti() {
		return emolumenti;
	}

	public void setEmolumenti(double emolumenti) {
		this.emolumenti = emolumenti;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

}
