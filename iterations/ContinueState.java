package iterations;

public class ContinueState {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++) {
			if(i==5) {
				continue;		//it will dismiss 5
			}
			System.out.println(i);
		}

	}

}
