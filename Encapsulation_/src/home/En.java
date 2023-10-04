package home;
// setter
class first
{
	private int a,b;
	public void setter(int x,int y)
	{
		a=x;
		b=y;
		
		System.out.println(a+" "+b);
	}
}

// getter
class second
{
	private int p,q;
	public int getter(int m,int n)
	{
		int l=m + n;
		return l;
		
		
	}
}

public class En {

	public static void main(String[] args) {
	
		first f1 = new first();
		f1.setter(10, 20);
		
		second s1 = new second();
		int x=s1.getter(10, 20);
		System.out.println(x);

	}

}
