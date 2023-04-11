package iterations;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num,i;
		System.out.println("Enter number");
		num = sc.nextInt();
		
		boolean flag = false;
		for(i=2 ; i<=num/2 ; i++) {
			if(num%i==0) {
				flag = true;		//number got divided
				break;				//terminate the loop 
			}
		}
		if(flag==false) {
			System.out.println("Is a Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}

	}

}
