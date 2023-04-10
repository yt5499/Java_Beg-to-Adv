package iterations;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
//		using while loop
		int sum=0;
		while(num>0) {
			int a=num % 2;
			sum +=a;
			num=num/2;
		}
		System.out.println("Sum: "+sum);
	}

}
