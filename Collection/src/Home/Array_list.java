package Home;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}

	}

}
