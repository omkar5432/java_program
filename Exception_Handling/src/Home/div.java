package Home;

public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10,b=0;     // Error 10 is not divisible by 0
			int c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}

	}

}
