package home;

class first
{
	void first_()
	{
		System.out.println("first");
	}
}

class second
{
	first f1 = new first();
	void second_()
	{
		System.out.println("Second");
	}
}

class third
{
	second s2 = new second();
	void third_()
	{
		System.out.println("third");

	}
}

class four
{
	third t3 = new third();
	void four_()
	{
		System.out.println("four");

	}
}

class five
{
	four f4 = new four();
	void five_()
	{
		System.out.println("five");

	}
}
public class aggregation_ {

	public static void main(String[] args) {
		five f5 = new five();
		f5.f4.t3.s2.f1.first_();
		f5.f4.t3.s2.second_();
		f5.f4.t3.third_();
		f5.f4.four_();
		f5.five_();
	}

}
