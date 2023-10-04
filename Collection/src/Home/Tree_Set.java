package Home;
import java.util.*;

public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter:");
		int s1= obj.nextInt();
		int s2= obj.nextInt();
		int s3= obj.nextInt();
		int s4= obj.nextInt();
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		
		System.out.println(t1);

		
		for(int a:t1)
		{
		System.out.println(a);
		}

	}

}
