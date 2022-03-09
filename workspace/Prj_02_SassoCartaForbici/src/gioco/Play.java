package gioco;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		
		String sceltaUmano = "";
		String sceltaPC = "";
		String risultato = "";
		
		int vittorie = 0;
		final int GIOCATE = 10000000;
		
		for (int i = 0; i < GIOCATE; i++) {
			sceltaUmano = sceltaPC();
			sceltaPC = sceltaPC();
			risultato = valutaVincitore(sceltaUmano, sceltaPC);
			
			//System.out.println(risultato);
			
			if (risultato.equals("Vince umano")){
				vittorie++;
			}
			
		}
		
		System.out.println("Hai giocato " + GIOCATE + " volte");
		System.out.println("Hai vinto " + vittorie + "volte");
		
	}

	

	private static String valutaVincitore(String sceltaUmano, String sceltaPC) {

		String res = null;
		
		
		if (sceltaUmano.equals(sceltaPC)) {
			res = "pareggio";
		} else {
			
			//caso 1 sasso
			if (sceltaUmano.equals("sasso")) {
				if (sceltaPC.equals("carta")) {
					res = "Vince PC";
				} else {
					res = "Vince umano";
				}
			}
		
			//caso 2 forbici
			if (sceltaUmano.equals("forbici")) {
				if (sceltaPC.equals("sasso")) {
					res = "Vince PC";
				} else {
					res = "Vince umano";
				}
			}
			
			//caso 3 carta
			if (sceltaUmano.equals("carta")) {
				if (sceltaPC.equals("forbici")) {
					res = "Vince PC";
				} else {
					res = "Vince umano";
				}
			}		
		
		
		}
		
		
		
		return res;
	}



	private static String sceltaUmano() {

		System.out.println("Scegli tra sasso, forbici, carta");
		
		Scanner sc = new Scanner(System.in);

		
		
		return sc.next();
	}

	private static String sceltaPC() {
		
		String res = null;
		
		double casuale = Math.random();
		
		if (casuale < 0.33) {
			res = "sasso";
		} else if (casuale < 0.66) {
			res = "forbici";
		} else {
			res = "carta";
		}
				
		return res;
	}
	
	
	
	
}
