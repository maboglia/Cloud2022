package view;

import model.Dado;

public class Gioco {

	public static void main(String[] args) {

		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		int res1 = 0;
		int res2 = 0;
		
		int vittorie = 0;
		int partite = 10_000_000;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < partite; i++) {
			
			res1 = d1.lancia();
			res2 = d2.lancia();

			if (res1==res2) {
				//System.out.println("hai vinto");
				vittorie++;
			} else {
				//System.out.println("non hai vinto");
			}
			
		}
		long stop = System.currentTimeMillis();
		
		
		System.out.println("hai giocato " + partite + " volte");
		System.out.println("hai vinto " + vittorie + " volte");
		System.out.println("l'elaborazione è durata: " + (stop - start) );
		
		
		
		
		

	}

}
