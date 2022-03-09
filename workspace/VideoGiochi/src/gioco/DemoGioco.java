package gioco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class DemoGioco {

	public static void main(String[] args) {

//		Gioco g1 = new Gioco("Pokemon UltraSole", "rpf", 49.99);
//		Gioco g2 = new Gioco("Super Mario galaxy 2", "platform", 59.99);
//		
//		System.out.println(g1.prezzo);
//		System.out.println(g2);
		
//		Gioco[] giochi = EstrattoreGiochi.estraifile();
		ArrayList<Gioco> giochi = EstrattoreGiochi2.estraifile();
		
		
		try {

			PrintStream output = new PrintStream(new File("giochi_prezzati.txt"));
			
			
			for (Gioco gioco : giochi) {
				output.println(gioco);
//				System.out.println(gioco);
			}

			
			//chiudo l'output = salvo il file
			output.close();
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
