package arrays;

import java.util.Scanner;

public class Simple2DArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows, cols;
		System.out.println("Enter number of rows");
		rows=sc.nextInt();
		System.out.println("Enter number of columns");
		cols=sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
//		taking input
		System.out.println("Enter elements");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.println("Enter element at "+(i+1)+" row and "+(j+1)+" column");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		
//		displaying array
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
