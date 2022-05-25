package model;

import java.util.Random;

public class Word {

	private String parola;
	
	private String[] parole = {"pizza", "mandolino", "spaghetti"};
	
	public String genera() {
		
		Random r = new Random();
		
		this.parola = parole[r.nextInt(parole.length)];
		
		return this.parola;
		
		
	}
	
	public String getParola() {
		return this.parola;
	}
	
	
}
