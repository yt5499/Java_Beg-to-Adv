package iterations;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		int rev=0;
		while(num>0) {
			int sn = num%10;
			rev = (rev*10)+sn;
			num = num/10;
			
		}
		System.out.println("Reverse number: "+rev);
	}

}
