package Generics;

public class Lead {

	public static void main(String[] args) {
		Employee<String> s=new Employee<String>("Sumit");
		s.show();
		
		Employee<Integer> i=new Employee<Integer>(3);
		i.show();
		

	}

}
