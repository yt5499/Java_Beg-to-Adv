package arrays;

import java.util.Scanner;


// here we are taking inputs for 1st and 2nd array from user & then performing addition on two arrays respectively.
public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows, cols, rows2, cols2, rows3, cols3;
		
		System.out.println("Enter number of rows for 1st array: ");
		rows=sc.nextInt();		
		System.out.println("Enter number of columns for 1st array: ");
		cols=sc.nextInt();
		
//		creating 1st array
		int[][] arr = new int[rows][cols];
		
//		int i,j;
		
//		taking input for 1st array
		System.out.println("Enter elements");
		for(int i=0; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.println("Enter element at "+(i+1)+" row and "+(j+1)+" column");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		
//		displaying 1st arrray
		System.out.println();
		System.out.println("1st array");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		creating 2nd array
		System.out.println();
		System.out.println("Enter number of rows for 1st array: ");
		rows2=sc.nextInt();		
		System.out.println("Enter number of columns for 1st array: ");
		cols2=sc.nextInt();
		
		int[][] arr2 = new int[rows2][cols2];
		
		
//		int i,j;
		
//		taking input for 2nd array
		System.out.println("Enter elements");
		for(int i=0; i<rows2 ; i++) {
			for(int j=0 ; j<cols2 ; j++) {
				System.out.println("Enter element at "+(i+1)+" row and "+(j+1)+" column");
				int ele = sc.nextInt();
				arr2[i][j] = ele;
			}
		}
		
//		displaying 2nd array
		System.out.println();
		System.out.println("2nd array");
		for(int i=0 ; i<rows2 ; i++) {
			for(int j=0 ; j<cols2 ; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		addition of 2 arrays
		System.out.println("Enter highest number you have entered for rows and columns");
		
		System.out.println("Enter highest number of rows you have entered priviously");
		rows3=sc.nextInt();		
		System.out.println("Enter highest number of columns you have entered priviously");
		cols3=sc.nextInt();
		
		int[][] add = new int[rows3][cols3];
		
		for(int i=0 ; i<rows3 ; i++) {
			for(int j=0 ; j<cols3 ; j++) {
				add[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		
//		printing added array
		System.out.println();
		System.out.println("Final answer of adding 2 arrays");
		for(int i=0 ; i<rows3 ; i++) {
			for(int j=0 ; j<cols3 ; j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
}
