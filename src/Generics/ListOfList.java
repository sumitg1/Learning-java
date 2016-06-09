package Generics;

public class ListOfList {
	public static void main(String arg[]){
	System.out.println(new multi().getValue(10.5));
	}
	
}

class multi{
	public <t> t getValue(t a){
		
		return a;
		
	}

}
