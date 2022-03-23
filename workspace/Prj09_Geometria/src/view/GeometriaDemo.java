package view;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {

		
		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(7, 5);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		
//		Triangolo t = new Triangolo(a, b, c);
//		Triangolo t1 = new Triangolo("Triangolo rettangolo ",a, b, c);
		
		Rettangolo r = new Rettangolo("Rettangolo", ab, bc);
		
		Quadrato q = new Quadrato("Quadrato", ab);
		
		//System.out.println(r);
		System.out.println(q);
	}

}
