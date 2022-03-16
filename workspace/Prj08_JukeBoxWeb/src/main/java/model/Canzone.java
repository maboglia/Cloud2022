package model;

public class Canzone {
	
	//static: della classe
	private static int counter = 1;
	
	public int id;
	public String titolo;
	public String cantante;
	
	public Canzone(String titolo, String cantante) {
		
		this.id = counter++;
		this.titolo = titolo;
		this.cantante = cantante;
	
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantante=" + cantante + "]";
	}
	
	

}
