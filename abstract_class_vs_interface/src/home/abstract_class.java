package home;

abstract class sky
{
	abstract void show();
	
	void display()
	{
		System.out.println("display function");
	}
	
	
}

class kite extends sky
{
	void show()
	{
		System.out.println("Abstract Class Method");
	}
}
public class abstract_class {

	public static void main(String[] args) {
		kite k1 = new kite();
		k1.show();
		k1.display();

	}

}
