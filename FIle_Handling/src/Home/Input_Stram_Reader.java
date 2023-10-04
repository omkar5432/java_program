package Home;
import java.util.*;
import java.io.*;

public class Input_Stram_Reader {

	public static void main(String[] args) throws Exception
	{
		int a,b,c;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Value of a: ");
		a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Value of b:");
		b=Integer.parseInt(br.readLine());
		if(a>b)	// Difference between two numbers  10 20  difference is 10
		{
			int s=a-b;
			System.out.println(s);
		}
		else
		{
			int d=b-a;
			System.out.println(d);
		}
	}

}
