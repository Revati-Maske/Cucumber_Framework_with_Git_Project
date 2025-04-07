package collectionPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
//		HashSet<Animal> animal=new HashSet<Animal>();
//		Animal animal1=new Animal("Dog", 12);
//		Animal animal2=new Animal("Frog", 2);
//		Animal animal3=new Animal("Lion", 18);
//		Animal animal4=new Animal("Tiger", 22);
//		Animal animal5=new Animal("Tiger", 22);
//		Animal animal6=new Animal("Dog", 12);
//		
//		animal.add(animal1);
//		animal.add(animal2);
//		animal.add(animal3);
//		animal.add(animal4);
//		animal.add(animal5);
//		animal.add(animal6);
//		for (Animal value: animal)
//			System.out.println(value);
//		System.out.println(animal1.equals(animal5));
//		
//		
//	}
	LinkedHashMap<String, String> has=new LinkedHashMap<String, String>();
	has.put("E", "a");
	has.put("A", "b");
	has.put("Z", "c");
	has.put("X", "d");
//	for(String word:has.keySet())
//		System.out.println(has.get(word));
	for(Map.Entry<String, String> entry:has.entrySet()) {
		System.out.println(entry.getKey());
	System.out.println(entry.getValue());
	}
	}
	
}
