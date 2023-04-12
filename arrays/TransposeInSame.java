package arrays;

public class TransposeInSame {

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
		
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(i<=j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}

	}

}
