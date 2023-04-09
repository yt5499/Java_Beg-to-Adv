package selection;

import java.util.Scanner;

//	finding maximum of three numbers using if else;
public class MaxOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, max;
		
		System.out.println("Enter number 1: ");
		a = sc.nextInt();
		System.out.println("Enter number 2: ");
		b = sc.nextInt();
		System.out.println("Enter number 2: ");
		c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=c;
			}
		}
		else {
			if(b>c) {
				max=b;
			}
			else {
				max=c;
			}
		}
		
		System.out.println("Max: "+max);
	}

}
