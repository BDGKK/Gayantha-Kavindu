package src;

import java.text.Format.Field;

public class Ref04 {
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		java.lang.reflect.Field[] fields = s.getClass().getFields();
		System.out.printf("There are %d fields\n", fields.length);
		for (java.lang.reflect.Field f : fields) {
			System.out.printf("field name = %s type = %s value = %d\n", f.getName(), f.getType(), f.getInt(s));
			
			
		}
	}

}
