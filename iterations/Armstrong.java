package iterations;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		
		int n=num;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=sum+(last*last*last);
			num=num/10;
		}
		
		if(sum==n) {
			System.out.println("Yes! Armstrong");
		}
		else {
			System.out.println("No! ");
		}

	}

}
