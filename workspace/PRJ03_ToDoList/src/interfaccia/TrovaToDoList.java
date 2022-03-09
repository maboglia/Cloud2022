package interfaccia;

import java.util.Scanner;

import controller.AgendaCtrl;
import model.ToDo;

public class TrovaToDoList {

	public static void main(String[] args) {
	
		AgendaCtrl agendaRossa = new AgendaCtrl();
		
		boolean gira = true;
		
		while(gira) {
			
		//1 mostrare un menu di scelta
		menu();
		//2 leggere la scelta utente
		String scelta = chiediUnaStringa("Scegli tra le opzioni proposte");	
			
		switch (scelta) {
		case "a": 
			//3 a) aggiungere un nuovo todo all'elenco
			String descrizione = chiediUnaStringa("Aggiungi la descrizione del Todo");
			int pos = chiediIntero("Inserisci un numero intero per la posizione della nota");
			agendaRossa.addTodo(descrizione, pos);
			break;
			
		case "b": 
			//4 b) modificare un todo dell'elenco
			System.out.println("mi dispiace non posso farlo!");
			break;
		case "c": 
			//5 c) stampare l'elenco
			System.out.println(agendaRossa.printTodo());
			
			break;
		case "d": 
			//6 d) uscire dal programma
			System.out.println("vuoi uscire dal programma");
			gira = false;
			break;
			
		default:

		break;
		}//fine switch	
			
		}//fine ciclo while
		
		
		System.out.println("Grazie per aver utilizzato il mostro programma");
		
	}

	private static int chiediIntero(String domanda) {
		int pos = 0;
		
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		pos = sc.nextInt();
		
		return pos;
	}

	private static void menu() {

		System.out.println("---------------------");
		System.out.println("a) per aggiungere un nuovo todo");
		System.out.println("b) per modificare un todo");
		System.out.println("c) per stampare la lista dei todo");
		System.out.println("d) per uscire dal programma");
		System.out.println("---------------------");
		
	}

	private static String chiediUnaStringa(String domanda) {
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		String descrizione = sc.nextLine();
		return descrizione;
	}

}
