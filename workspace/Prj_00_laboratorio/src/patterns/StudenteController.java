package patterns;

public class StudenteController {

	private Studente studente;
	private StudenteView studenteView;
	
	
	public StudenteController(Studente studente, StudenteView studenteView) {
		this.studente = studente;
		this.studenteView = studenteView;
	}
	
	public void setNomeStudente(String nome) {
		this.studente.setNome(nome);
	}

	public void setMatricola(int nMat) {
		this.studente.setnMat(nMat);
	}

	public String getNomeStudente() {
		return this.studente.getNome();
	}
	
	public int getMatricola() {
		return this.studente.getnMat();
	}
	
	public void updateView() {
		String matricolaTrasf= "000" + Integer.toString(getMatricola());
		this.studenteView.stampaDettagliStudente(getNomeStudente(),matricolaTrasf );
	}
	
}
