
public class Assignment3 {

	int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment3 as = new Assignment3();
		System.out.println(as.a);
		System.out.println(as.b);
		as.a = 50;
		as.b = 100;
		Assignment3 as1 = new Assignment3();
		System.out.println(as1.a); //it prints the 10 because every object access the different memory alocation. 
		System.out.println(as1.b); //it prints 100 because every object access the same memory allocation of static var

	}

}
