package Java_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_test {

	public static void main(String[] args) {
		
		
		//Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		//Set<String> set = new LinkedHashSet<>();

		set.add("Nepal");
		set.add("India");
		set.add("Japan");
		set.add("India");
		set.add("Korea");
		set.add("Nepal");
		set.add("China");
		
		for(String s : set) {
			System.out.println(s);
		}
		/*
		 * create and display set of dog.
		 * create set of mobile and  display in ascending order.
		 */
	}
}
