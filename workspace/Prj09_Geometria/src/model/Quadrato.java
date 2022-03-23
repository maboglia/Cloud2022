package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(String nome, Segmento lato) {
		super(nome, lato, lato);
		this.lato = lato;
		System.out.println(lato);
		System.out.println("costruito un oggetto quadrato ");
		System.out.println();
		this.setPerimetro(calcolaPerimetro());
		this.setSuperficie(calcolaSuperficie());
	}

	@Override
	public double calcolaPerimetro() {
		System.out.println("ho usato il metodo del quadrato");
		System.out.println(this.lato);
		return this.lato.getLunghezza() * 4;
	}

	@Override
	public double calcolaSuperficie() {
		return this.lato.getLunghezza() * this.lato.getLunghezza();
	}
	
	

}
