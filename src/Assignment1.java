
public class Assignment1 {

	/* create one class, create 2 instance variable, create two static methods, access instance variables 
	 * inside the static methods, and call two static methods inside the main method
	 */
	
	
	int a = 100;
	int b = 200;
	static int c =4;
	//public Assignment1 assignment;
	static void m1()
	{
		//assignment = new Assignment1();
		Assignment1 assignment = new Assignment1();
		System.out.println(assignment.a);
		System.out.println(assignment.b);
		//you can access static variable by three ways
		System.out.println(assignment.c);  //by object
		System.out.println(c);            //direct
		System.out.println(Assignment1.c); //by classname
		
	}
	
	void m3()
	{
		Assignment1 assignment = new Assignment1();
		//you can access static variable by three ways
		System.out.println(assignment.c);  //by object
		System.out.println(c);            //direct
		System.out.println(Assignment1.c); //by classname
		
	}
	static void m2()
	{
		Assignment1 assignment = new Assignment1();
		System.out.println(assignment.a);
		System.out.println(assignment.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		m2();
		Assignment1 assignment = new Assignment1();
		assignment.m3();
	}

}
