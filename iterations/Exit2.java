package iterations;

public class Exit2 {

	public static void main(String[] args) {
		
		System.out.println("1st");
		testing();
		System.out.println("2nd");

	}
	
	public static void testing() {
		int a = 25;
		System.out.println("First");
		
		if(a==25) {
			System.exit(0);			//will terminate everything after that
		}
		
		System.out.println("Second");
	}

}
