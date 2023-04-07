package oprnexpr;

//	logical bitwise operators
public class BitwiseOper {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		int c;
		
//		original numbers
		System.out.println(a);
		System.out.println(b);
		
		c = a&b;
		System.out.println("a&b: "+c);
		
		c = a|b;
		System.out.println("a|b: "+c);
		
		c = a^b;
		System.out.println("a^b: "+c);
		
		c = ~b;
		System.out.println("~b: "+c);
		
		c = a<<3;
		System.out.println("a<<3: "+c);
		
		c = b>>2;
		System.out.println("b>>2: "+c);
		
		a=-1;
		c = a>>>15;
		System.out.println("a>>>15: "+c);

	}

}
