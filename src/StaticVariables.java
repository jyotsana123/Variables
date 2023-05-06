
public class StaticVariables {

	//https://www.youtube.com/watch?v=CG92aa0pOz0&list=PLd3UqWTnYXOkIbQ-9MfOK4HOGo0Hdtuti&index=8
	static int a = 100;
	static int b = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		System.out.println(b);
		StaticVariables sv = new StaticVariables();
		sv.m1();
		m2();
	}
	
	void m1()
	{
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
	}
	
	static void m2()
	{
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
	}

}


/* 1. Static variable declared inside the class and outside the methods with static modifiers
   2. Scope is within the class
   3. Memory allocated when .class file is loading, When .class file unloading memory destroyed
   4. You can access static variable by using class name, direct or by using object in instance and static area both
   5. Static variable are stored in non heap memory */