
public class LocalVariable {
	
	//https://www.youtube.com/watch?v=CG92aa0pOz0&list=PLd3UqWTnYXOkIbQ-9MfOK4HOGo0Hdtuti&index=8
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		System.out.println(a);

	}
	
	void m1()
	{
	//	System.out.println(a); //not possible
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	
	void m2()
	{
//		System.out.println(a); //not possible
//		System.out.println(b);
	}

}

/* 1. Local variable declared inside the method, constructor and blocks
 * 2. Scope of local variable is inside the method, constructor and block
 * 3. Local variable memory allocated when method/constructor/block is called and destroyed when method/constructor/block are completed
 * Local variables are stored in stack memory  */
