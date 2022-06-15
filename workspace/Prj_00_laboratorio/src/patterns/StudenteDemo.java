package patterns;

public class StudenteDemo {

	public static void main(String[] args) {
		Studente s1 = new Studente();
		s1.setnMat(1);
		s1.setNome("pippo");

		StudenteView sv = new StudenteView();
		
		StudenteController ctrl = new StudenteController(s1, sv);
		
		ctrl.updateView();
		
	}

}
