package Home;

import java.util.ArrayList;

public class Sum_ {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		int sum=0;
		
		for(int i=0;i<a1.size();i++)
			
		{
		    sum = sum + a1.get(i);
			System.out.println(sum);
		}
		

	}

}
