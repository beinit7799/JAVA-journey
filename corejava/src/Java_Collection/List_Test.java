package Java_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Test {

	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();

		
		
		list.add("Hari");
		list.add("Ram");
		list.add("Anup");
		list.add("kamal");
		
		for(String s : list) {
			
			System.out.println(s);
		}
		
		list.remove(2);
		list.remove("Ram");
		System.out.println(list.contains("kamal"));
		
        for(String s : list) {
			
			System.out.println(s);
		}
        
        
	}
}
