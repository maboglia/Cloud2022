package patterns;

public class SingletonDemo {

	public static void main(String[] args) {

		SingleObject so = SingleObject.getIstanza();
		so.salutami();
		

	}

}
