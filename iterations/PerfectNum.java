package iterations;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, fact, sum=0;
		System.out.println("Enter number");
		num = sc.nextInt();
		int dnum = num;
		
		for(int i=1 ; i<=num/2 ; i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		
		if(sum==dnum) {
			System.out.println("Is a perfect number");
		}
		else {
			System.out.println("Not a Perfect number");
		}
		
	}

}
