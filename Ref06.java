package src;

import java.text.Format.Field;

public class Ref06 {
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		java.lang.reflect.Field[] fields = s.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		
		for(java.lang.reflect.Field f : fields) {
			System.out.printf("field name=%s type=%s accessible=%s\n", f.getName(), f.getType(), f.isAccessible());
		}
	}
}
