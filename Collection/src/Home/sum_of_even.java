
//Sum of Even Number
package Home;

import java.util.ArrayList;

public class sum_of_even {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(9);
		a1.add(14);
		a1.add(40);
		a1.add(5);
		a1.add(60);
		
		int sum=0;
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i)%2==0)
			{
			 sum=sum+a1.get(i);
			}
			
			System.out.println("Sum value: "+sum);
		}

	}

}
