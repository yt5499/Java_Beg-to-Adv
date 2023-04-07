package oprnexpr;

import java.util.Scanner;

//	finding max by using conditional operator bit different
public class Maxof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,max;
		System.out.print("Enter first number:");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		max = ((a>b) ? a : b);		//syntax= ((Condition) ? if(Condition_true) : else)
		System.out.println("Maximum: "+max);
	}

}
