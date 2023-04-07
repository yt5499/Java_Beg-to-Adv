package oprnexpr;

//		Increment and decrement operator
public class IncDec {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
//		original numbers
		System.out.println(a);
		System.out.println(b);
		
//		increment
		c = (++a) + (a++);
		System.out.println(c);
		
//		decrement
		c = (b--)+(--b);
		System.out.println(c);

	}

}
