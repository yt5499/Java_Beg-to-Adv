package varndatatypes;

public class BooleanTest {

	public static void main(String[] args) {
		
		boolean b;
		
		b = false;
		System.out.println("B: "+b);
		
		b = true;
		System.out.println("B: "+b);
		
		if(b) {
			System.out.println("This is executed");
		}
		
		b = false;
		if(b) {
			System.out.println("This is not executed");
		}
		
		System.out.println("10 > 9 is "+(10>9));

	}

}
