package src;

import java.lang.reflect.Method;

public class Ref09 {
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		Method [] methods = s.getClass().getMethods();
		System.out.printf("There are %d methods\n", methods.length);
		
		for (Method m : methods) {
			System.out.printf("method name=%s type=%s parameters = ", m.getName(), m.getReturnType());
			Class [] types = m.getParameterTypes();
			for(Class c : types) {
				System.out.print(c.getName() + "  ");
			}
			System.out.println();
		}
	}
}
