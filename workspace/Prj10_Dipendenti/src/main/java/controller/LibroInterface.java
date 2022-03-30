package controller;

import java.util.List;

import model.Dipendente;

public interface LibroInterface {

	//implicitamente public e abstract
	void addDipendente(Dipendente d);
	void addDipendente(String nome, String ruolo);
	
	Dipendente getDipendentebyId(int id);
	List<Dipendente> getAll();
	
	
}
