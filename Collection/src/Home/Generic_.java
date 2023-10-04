package Home;

class mouse
{
	static <c> void get(c a[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
	}
}

public class Generic_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {10,20,30,40,50};
		mouse.get(a);
		
		String name[] = {"Om","Sham","Ram","Nal","Nil"};
		mouse.get(name);
		
		Double d[] = {10.5,15.5,33.5,16.5,65.5};
		mouse.get(d);

	}

}
