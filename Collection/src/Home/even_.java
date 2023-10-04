package Home;

import java.util.ArrayList;

public class even_ {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(13);
		a1.add(20);
		a1.add(15);
		a1.add(17);
		
		
		
		for(int i=0;i<a1.size();i++)
			
		{
		   if(a1.get(i) % 2 == 0)
		   {
			   System.out.println("Number is Even");
		   }
		   else
		   {
			   System.out.println("Number is odd");
		   }
		   
		   System.out.println(a1.get(i));
		}

	}

}
