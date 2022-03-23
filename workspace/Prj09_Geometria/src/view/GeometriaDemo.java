package view;

import model.Punto;
import model.Segmento;

public class GeometriaDemo {

	public static void main(String[] args) {

		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(9, 2);
		
		Segmento ab = new Segmento(a, b);
		
		System.out.println(ab);
		System.out.println(ab.getLunghezza());
		
	}

}
