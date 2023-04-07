package oprnexpr;

import java.util.Scanner;

public class Maxof3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,max;
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		System.out.print("Enter third number: ");
		c = sc.nextInt();
		
		max = ((a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c));		//syntax= ((Condition) ? if(Condition_true) : else)
		System.out.println("Maximum: "+max);

	}

}
