package Home;
import java.util.*;

import java.util.HashMap;

public class Hash_Table {

	public static void main(String[] args) {
		Hashtable<String,Integer> Table = new Hashtable<String,Integer>();
		Table.put("Om", 101);  // (key, value)
		Table.put("Sham", 102);
		Table.put("Ram", 103);
		
		for(Map.Entry m:Table.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		}

}
