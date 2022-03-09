package controller;

import model.Agenda;
import model.ToDo;

public class AgendaCtrl {

	public Agenda agenda = new Agenda();
	
	public void addTodo(String descrizione, int posizione) {
		//costruisco l'oggetto di tipo ToDo
		ToDo t = new ToDo();
		//assegno alla proprietà descrizione il valore che mi ha passato l'utente
		t.descrizione = descrizione;
		//stabilisco che la proprietà fatto sai assegnata a false
		t.fatto = false;
		//aggiungo il todo alla agenda alla posizione indicata dall'utente
		agenda.cosedafare[posizione] = t;
	}
	
	public String printTodo() {
		
		String risultato = "";
		
		for (ToDo t : agenda.cosedafare) {
			
			if (t != null) {
				risultato += t.stampa();
				risultato += "\n";
			}
			
		}//fine ciclo for
		return risultato;
		
	}
	
}
