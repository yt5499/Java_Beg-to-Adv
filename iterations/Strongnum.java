package iterations;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, fact, sum=0;
		System.out.println("Enter number");
		num = sc.nextInt();
		int dnum = num;
		
		while(num!=0) {
			int a = num%10;
			fact = 1;
			for(int i=2 ; i<=a ; i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(sum==dnum) {
			System.out.println("Is Strong number");
		}
		else {
			System.out.println("Not a Strong number");
		}

	}

}
