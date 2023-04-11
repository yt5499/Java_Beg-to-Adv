package iterations;

public class ReturnS2 {

	public static void main(String[] args) {
		
		System.out.println("1st");
		testing();
		System.out.println("2nd");

	}
	
	public static void testing() {
		int a = 25;
		System.out.println("First");
		
		if(a==25) {
			return;			//basically end of program/ return will work only in the function where it is present
		}
		
		System.out.println("Second");
	}

}
