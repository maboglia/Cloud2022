package controller;

import java.util.ArrayList;
import java.util.List;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class LibroMatricola implements LibroInterface {

	private static List<Dipendente> dipendenti = new ArrayList<>();

	@Override
	public void addDipendente(Dipendente d) {
		dipendenti.add(d);
		
	}

	@Override
	public void addDipendente(String nome, String ruolo) {
		Dipendente d = null;
		switch (ruolo) {
			case "impiegato": 
				d = new Impiegato(nome);
				break;
			case "dirigente": 
				d = new Dirigente(nome);
				break;
			case "fattorino": 
				d = new Fattorino(nome);
				break;
		}	
		dipendenti.add(d);
	}

	@Override
	public Dipendente getDipendentebyId(int id) {
		
		//scorro l'elenco dei dipendenti
		for (Dipendente dipendente : dipendenti) {
			//se la matricola del dip corrente corrisponde a  quella in argomento, ritorno il dip
			if (dipendente.getnMatr() == id)
				return dipendente;
		}
		//altrimenti ritorno null
		return null;
	}

	@Override
	public List<Dipendente> getAll() {
		// TODO Auto-generated method stub
		return dipendenti;
	}

	
	
}
