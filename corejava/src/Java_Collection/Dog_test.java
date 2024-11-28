package Java_Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dog_test {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		Set<Dog> dog = new LinkedHashSet<>();
		d1.setDogName("Tomy");
		d1.setAge("4");
		d1.setBreed("Beagle");
		
		d2.setDogName("Danyel");
		d2.setAge("5");
		d2.setBreed("shrepherd");
		
		d3.setDogName("Pluto");
		
		
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		
		for(Dog d : dog) {
			System.out.println(d);
		}
	}


	

}
