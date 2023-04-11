package arrays;

//simple array & displaying using toString method
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
//		displaying using toString method
		System.out.println("Your Array using toString method: "+Arrays.toString(arr));
		
//		displaying using for-loop
		System.out.println();
		System.out.println("Your Array using for-loop: ");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
