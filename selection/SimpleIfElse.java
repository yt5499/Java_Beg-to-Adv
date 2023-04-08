package selection;

import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		if(n<100) {
			System.out.println("Your entered number is greater than 1 and less than 100");
		}
		else {
			System.out.println("Number invalid");
		}
		

	}

}
