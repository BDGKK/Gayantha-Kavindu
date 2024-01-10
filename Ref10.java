package src;

import java.lang.reflect.Method;

public class Ref10 {
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		Method m = s.getClass().getDeclaredMethod("setA", int.class);
		m.setAccessible(true);
		m.invoke(s, 76);
		System.out.println(s);
	}

}
