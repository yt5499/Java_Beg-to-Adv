package arrays;

import java.util.Scanner;

public class FiboInArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[20];
		
		arr[0]=0;
		arr[1]=1;
		
		System.out.println("Enter limit");
		int n = sc.nextInt();
		
		for(int i=2 ; i<n ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
//		displaying
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
