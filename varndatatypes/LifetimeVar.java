package varndatatypes;

public class LifetimeVar {
	
	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=5;i++) {
			increment();
		}
		
	}
	
	private static void increment() {
		int x = 10;
		x +=1;
		
		System.out.println(" "+x);
	}

}
