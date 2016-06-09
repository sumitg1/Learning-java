package practice;
import java.lang.reflect.*;
class student {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Employee e=new Employee();
		Class s=e.getClass();
		
		
		System.out.println(s.getName());
		Field[] F=s.getDeclaredFields();
		for (Field f:F){
			System.out.println(f.getName());
			System.out.println(f.get(s));
		}
		
		
		Method[] allMethods = s.getDeclaredMethods();
		for(Method m: allMethods){
			System.out.println(m.invoke((Object)e,null));
		}
		
		
		
	}
}