package reflection;

import java.lang.reflect.Constructor;

public class Reflection_demo {

	public static void main(String[] args) {
		Automobile a = new Automobile();
		
		Class<?> class1 = a.getClass();
		
		Constructor<?>[] constructors = class1.getConstructors();
		Constructor<?> constructor = constructors[0];
	
		Object o = null;
		
		try {
			o = constructor.newInstance();
			System.out.println("pippo" + o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
