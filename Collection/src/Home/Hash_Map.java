package Home;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put(null, 101);  // (key, value)
		map.put("Sham", 102);
		map.put("Ram", null);
		
		System.out.println(map);
		
	}

}
