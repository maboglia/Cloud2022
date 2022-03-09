package model;

public class ToDo {

	public String descrizione;
	public boolean fatto;
	
	public String stampa() {
		String messaggio = "";
		if (fatto) {
			messaggio += "[*]";
		} else {
			messaggio += "[ ]";
		}
		messaggio += descrizione;
		return messaggio;
		
		
	}




}
