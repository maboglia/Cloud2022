package model;

public class Triangolo extends Poligono {

	private Punto a, b, c;
	private Segmento ab, bc, ac;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		super("Triangolo");
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.bc = new Segmento(b, c);
		this.ac = new Segmento(a, c);
		
		this.setPerimetro(calcolaPerimetro());
		this.setSuperficie(calcolaSuperficie());
		
		System.out.println("ho costruito un triangolo generico");
	}
	
	public Triangolo(String nome, Punto a, Punto b, Punto c) {
		this(a, b, c);
		this.nome = nome;
//		super(nome);
		System.out.println("ho costruito un triangolo DI NOME " + nome);
	}

	public double calcolaPerimetro() {
		return this.ab.getLunghezza() +
				this.bc.getLunghezza() +
				this.ac.getLunghezza();
	}
	
	
	public double calcolaSuperficie() {
		
		double sp = calcolaPerimetro() / 2;
		
		double area = Math.sqrt(
				sp * 
				(sp - ab.getLunghezza()) *
				(sp - ac.getLunghezza()) *
				(sp - bc.getLunghezza()) 
				);
		return area;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Triangolo [toString()=" + super.toString() + "]";
	}

	
}
