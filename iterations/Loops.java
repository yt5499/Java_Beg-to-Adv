package iterations;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println("for-loop");
//		for-loop
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("For: "+i);
		}
		
//		while-loop
		System.out.println();
		System.out.println("while-loop");
		int n=1;	//initializing
		while(n<=10) {
			System.out.println("While: "+n);
			n += 1;
		}
		
//		do-while loop
		System.out.println();
		System.out.println("do-while loop");
		int a=1;
		do {
			System.out.println("Number: "+a);
			a++;
		} while (a<11);
		
//		for-each loop
		System.out.println();
		System.out.println("for-each loop");
		int[] arr = {1,2,3,4,5,6,7,8,9,1,2,5};
		
		for (int i : arr) {
			System.out.println(arr[i]);
		}
	}
}
