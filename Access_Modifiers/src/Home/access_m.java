package Home;


// Public
class A
{
	int a;
	void show()
	{
		System.out.println(a);
	}
}

// Private
class private_
{
	private int a=10;
	public  void display()
	{
		System.out.println("Private Method");
	}
}


// Protected
class protected_ 
{
	protected void display()
	{
		System.out.println("Protected method");
		System.out.println();
	}
}


public class access_m extends protected_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private_ p = new private_();
		p.display();
		access_m m = new access_m();
		m.display();
		A a =new A();
		a.a=10;
		a.show();

	}

}
