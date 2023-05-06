
public class Assignment2 {

	int a = 10;
	int b = 20;
	static int c = 20;
	static int d = 40;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	static void m2()
	{
		Assignment2 as2 = new Assignment2();
		System.out.println(as2.a);
		System.out.println(as2.b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment2 as2 = new Assignment2();
		as2.m1();
		m2();
	}

}
