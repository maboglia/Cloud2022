package model;

public class Fattorino extends Dipendente {

	private int nConsegne;
	private double pagaBase;
	
	public Fattorino(String nome) {
		super(nome);
		this.ruolo = "fattorino";
	}

	@Override
	public double calcolaStipendio() {
		return nConsegne * pagaBase;
	}

	public int getnConsegne() {
		return nConsegne;
	}

	public void setnConsegne(int nConsegne) {
		this.nConsegne = nConsegne;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

}
