package oprnexpr;

//		understanding logical AND(&) and logical short-circuit AND(&&) operator
public class LogNsc {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		if((a<5)&&(++b>30)) {
			System.out.println("True");
		}
		System.out.println("b= "+b);
		
		if((a<5)&(++b>30)) {
			System.out.println("True");
		}
		System.out.println("b= "+b);

	}

}
