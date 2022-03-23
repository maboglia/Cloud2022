package model;

public class Punto {

	//incapsulamento: nascondere all'esterno le proprietà degli oggetti, information hiding
	private int x, y;
	
	
	/**
	 * Costruttore del punto senza parametri,
	 * il valore di x e y sarà uguale a 0
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Costruttore del punto con un parametr
	 * @param x inserisci il valore di x
	 */	
	public Punto(int x) {
		this.y = 0;
		this.x = x;
	}
	
	/**
	 * Costruttore del punto con due parametri
	 * @param x inserisci il valore di x
	 * @param y	inserisci il valore di y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//getters, accessori per accedere alle props 
	//ritornano un valore del tipo corrispondente
	
	public int getX() {
		return this.x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
}
