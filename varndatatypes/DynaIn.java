package varndatatypes;

//import java.math.MathContext;

// dynamic initialization
public class DynaIn {

	public static void main(String[] args) {
		
		double a = 5.0 ,b = 8.0;
		
//		here c is dynamically initialized
		double c = Math.sqrt(a * a + b * b);
		
		System.out.printf("Hypotenuse is: %.2f",c);

	}

}
