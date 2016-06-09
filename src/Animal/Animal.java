package Animal;

import java.util.HashMap;
import java.util.Map;

public class Animal {
    private Map<String,Animal> friends = new HashMap<>();

    public void addFriend(String name, Animal animal){
        friends.put(name,animal);
    }

    
    public <T extends Animal> T callFriend(String name, Class<T> type) {
        return type.cast(friends.get(name));
    }
    
   /* 
    @SuppressWarnings("unchecked")
        public <T extends Animal> T callFriends(String name) {
        return (T)friends.get(name);
    }
    
    
    public Animal callFriend(String name){
    	System.out.println(friends.get(name));
        return friends.get(name);
    }*/
}