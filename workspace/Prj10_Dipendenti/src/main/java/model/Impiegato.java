package model;

public class Impiegato extends Dipendente {

	private int oreLavoro;
	private double pagaOraria;
	
	public Impiegato(String nome) {
		super(nome);
		this.ruolo = "impiegato";
	}

	@Override
	public double calcolaStipendio() {
		return oreLavoro * pagaOraria;
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}

	public double getPagaOraria() {
		return pagaOraria;
	}

	public void setPagaOraria(double pagaOraria) {
		this.pagaOraria = pagaOraria;
	}

}
