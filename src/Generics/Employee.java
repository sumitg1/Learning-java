package Generics;

public class Employee<t> {
	t obj;
	Employee(t obj){
		this.obj=obj;
	}
	public void show(){
		System.out.println(obj.getClass().getName());
	}	
}
