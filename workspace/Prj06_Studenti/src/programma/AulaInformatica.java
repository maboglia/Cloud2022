package programma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AulaInformatica {

	public static void main(String[] args) {
		
		
		
		Studente[] elencoStudenti = leggiFile();
		Registro r = new Registro(elencoStudenti);
		
		int presenti = r.faiAppello();
		
		System.out.println("Sono presenti " + presenti + " studenti!");
		
		
		

	}

	private static Studente[] leggiFile() {//dichiaro che questo metodo rit un array di studente

		Studente[] studenti = new Studente[30];//un contenitore di studente, vuoto, con 30 posti

		File f = new File("files/studentis.txt");//crea un obj di tipo file
		
		try {//gestisce l'eccezione fnf
			Scanner sc = new Scanner(f);//crea uno scanner e collega il file
			int i = 0;
			while(sc.hasNextLine()) {//scorre il file finché ci sono righe
				
				String riga = sc.nextLine();//legge la singola riga
				String[] paroleDellaRiga = riga.split(", ");//spezza la riga in 2 parti
				String nome = paroleDellaRiga[0];//memorizza in nome la prima parte
				String cognome = paroleDellaRiga[1];//memo in cognome la seconda parte
				int nMatricola = i + 1;//attribuisce una matricola
				
				Studente s = new Studente(nMatricola, nome, cognome);//creo uno stud
				//nel contenitore di studenti alla pos i-esima
				studenti[i] = s;//add studente alla collezione in posiz i-esima
				i++;
				
				System.out.println(s.stampa());
				
			}
			
		} catch (FileNotFoundException e) {			
			System.err.println("mi dispiace, non ho trovato il file!");
		}
		return studenti;//ritorno la colelzione di obj di tipo Studente
	}//fine metodo

}
