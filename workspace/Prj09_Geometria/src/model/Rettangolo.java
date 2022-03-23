package model;

public class Rettangolo extends Poligono{

	private Segmento base, altezza;
	
	public Rettangolo(String nome, Segmento base, Segmento altezza) {
		super(nome);
		this.base = base;
		this.altezza = altezza;
		System.out.println("Costruito un " + nome);
		//this.setPerimetro(calcolaPerimetro());
		//this.setSuperficie(calcolaSuperficie());
	}

	public double calcolaPerimetro() {
		return 2 * (base.getLunghezza() + altezza.getLunghezza());
	}
	
	public double calcolaSuperficie() {
		return this.base.getLunghezza() * this.altezza.getLunghezza();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rettangolo " + super.toString();
	}
	
	
	
}
