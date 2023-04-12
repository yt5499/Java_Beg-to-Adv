package arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		
//		predefined array
		int arr[][] = {
				{1,2,3},
				{4,5,6,},
				{7,8,9},
		};
		
		System.out.println("Original matrix:");
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		int[][] arr2 = new int[3][3];		//array for transpose elements
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose matrix is as follows:");
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
