package collezioni;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) {

		ArrayList<String> todoList = new ArrayList<>();

		todoList.add("latte");//add aggiunge
		todoList.add("pane");
		todoList.add("vino");
		todoList.add("acqua");
		todoList.add("biscotti");

		System.out.println(todoList.size());//size()
		
		todoList.remove(0);//
		System.out.println(todoList.size());
		
		System.out.println(todoList.get(0));
		
		//wrapper classes java.lang.Double -> double
		
		ArrayList<Integer> voti = new ArrayList<Integer>();
		
		voti.add(20);
		voti.add(22);
		voti.add(23);
		voti.add(24);
		voti.add(26);
		
		double tot = 0;
		for (int voto : voti) {
			System.out.println(voto);
			tot += voto;
		}
		System.out.println(tot/voti.size());
		
		
		
	}

}
