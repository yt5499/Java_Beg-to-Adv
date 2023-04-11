package arrays;

import java.util.Scanner;

public class UserinArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		taking size/length from user		
		int ln, i;
		System.out.print("Enter length of array you want: ");
		ln = sc.nextInt();
		
		int[] arr = new int[ln];
		
//		asking to input elements
		for(i=0 ; i<ln ; i++) {
			System.out.println("Enter element at position "+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
//		printing arrays
		for(i=0 ; i<ln ; i++) {
			System.out.println(arr[i]);
		}

	}

}
