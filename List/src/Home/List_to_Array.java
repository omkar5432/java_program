package Home;
import java.util.*;

import java.util.List;




public class List_to_Array {

	public static void main(String[] args) {
	List<Double> l1= new ArrayList<Double>();
	l1.add(10.55d);
	l1.add(55.66d);
	l1.add(66.10d);
	l1.add(88.33d);
	
	int d= l1.size();
	Double s[]= l1.toArray(new Double[d]);
	for(int i=0;i<4;i++)
	{
		System.out.println(s[i]);
	}
	}
	
}
