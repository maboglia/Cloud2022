package model;

public class Poligono {

	protected String nome;
	private double perimetro, superficie;
	
	
	public Poligono(String nome) {
		this.nome = nome;
		System.out.println("ho costruito un poligono generico ");
	}


	public double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	@Override
	public String toString() {
		return "Poligono [nome=" + nome + ", perimetro=" + perimetro + ", superficie=" + superficie + "]";
	}
	
	
	
	
}
