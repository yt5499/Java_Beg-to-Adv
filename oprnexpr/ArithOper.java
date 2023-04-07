package oprnexpr;

//	Arithmetic operators
public class ArithOper {

	public static void main(String[] args) {
		
		int a = 25, b = 50;
		float c = 20.5f, d = 41.3f;
		
//		display
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		System.out.println();
		
//		different operators
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("a%b= "+(a%b));
		
		System.out.println("c+d= "+(c+d));
		System.out.println("c*d= "+(c*d));
		System.out.println("c%d= "+(c%d));
		System.out.println();
		
		System.out.println("-a%b= "+(-a%b));
		System.out.println("-a%-b= "+(-a%-b));
		System.out.println("c%-d= "+(c%-d));
		System.out.println();

	}

}
