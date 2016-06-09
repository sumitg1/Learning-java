package Generics;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String arg[]) {

		new test().testMethode1("A");
		new test().testMethode1(10.5);

	}

}

class test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <t> void testMethode1(t a) {
		List l = new ArrayList<t>();
		l.add(a);
	}

}