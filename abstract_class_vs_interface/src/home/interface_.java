package home;
interface college
{
	public void show();
}

class student implements college
{
	public void show()
	{
		System.out.println("Interface Method");
	}
}

public class interface_ {

	public static void main(String[] args) {
		student s1 = new student();
		s1.show();

	}

}
