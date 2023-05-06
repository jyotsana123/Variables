
public class DefaultValues {

	int a=10;
	boolean b = true;
	int c;    //if we don't assign any value JVM will print default values in instance variables
	boolean d;
	
	static float e;   //if we don't assign any value JVM will print default values in static variables
	static boolean f;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultValues dv = new DefaultValues();
		System.out.println(dv.a);
		System.out.println(dv.b);
		System.out.println(dv.c);   
		System.out.println(dv.d);
		
		System.out.println(DefaultValues.e);
		System.out.println(DefaultValues.f);
		
//		int x;
//		int y;
//		System.out.println(x);  //for local variables default values are not printed, it should be initialized
//		System.out.println(y);
	}

}
