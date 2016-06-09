package Animal;

public class Mouse extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse jerry = new Mouse();
		jerry.addFriend("spike", new Dog());
		jerry.addFriend("quacker", new Duck());
		jerry.addFriend("meomeo", new Cat());

		
	//	jerry.callFriend("spike", Dog.class).bark();	
		
		jerry.callFriend("meomeo", Cat.class).bark();
		
	//	jerry.<Dog>callFriends("meomeo").bark();
	//	((Dog) jerry.callFriend("spike")).bark();
	//	((Duck) jerry.callFriend("quacker")).quack();
		
		
		

	}

}
