package model;

public class Segmento {

	private Punto a, b;
	private double lunghezza;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		calcolaLunghezza();
	}

	public Punto getA() {
		return a;
	}

	public Punto getB() {
		return b;
	}


	public double getLunghezza() {
		return lunghezza;
	}

	@Override
	public String toString() {
		return "[a=" + a + ", b=" + b + "]";
	}
	
	private void calcolaLunghezza() {
		
		double diffX = Math.pow(b.getX() - a.getX(), 2);  
		double diffY = Math.pow(b.getY() - a.getY(), 2);
		this.lunghezza = Math.sqrt(diffX + diffY);
		
	}
	
	
	
}
