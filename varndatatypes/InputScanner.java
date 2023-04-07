package varndatatypes;

import java.util.Scanner;

//	taking input from user creating scanner class object

public class InputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		System.out.println("Your entered number is: "+n);
	}

}
