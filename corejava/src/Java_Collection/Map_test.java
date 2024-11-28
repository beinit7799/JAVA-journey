package Java_Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_test {

	public static void main(String[] args) {
		
		//Map<String,Integer> map = new HashMap<>();
		//Map<String,Integer> map = new TreeMap<>();
		Map<String,Integer> map = new LinkedHashMap<>();


		map.put("Nepali",90);
		map.put("Math", 80);
		map.put("Computer", 97);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
	}
}
