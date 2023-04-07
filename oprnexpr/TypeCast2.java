package oprnexpr;

//automatic type casting(implicit conversion)
public class TypeCast2 {

	public static void main(String[] args) {
		
		int a = 5;
		float b = 10.56f;
		byte c = 9;
		double d = 15.256;
		
		double result = (a-b) * (d/c);
		
		System.out.println("Result: "+result);

	}

}
