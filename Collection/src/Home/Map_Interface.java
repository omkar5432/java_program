package Home;

import java.util.*;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Om", 101);  // (key, value)
		
		map.put("Sham", 102);
		map.put("Ram", 103);
		
		for(Map.Entry m:map.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
