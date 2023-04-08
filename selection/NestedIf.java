package selection;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sale, commision;
		
		System.out.println("Enter sales: ");
		sale = sc.nextDouble();
		
//		conditions
		if(sale<5000) {
			commision = 0;
		}
		else {
			if(sale<10000) {
				commision = sale * 0.05;
			}
			else {
				if(sale<20000) {
					commision = sale * 0.1;
				}
				else {
					commision = sale * 0.15;
				}
			}
		}
		System.out.println("Comission is: "+commision);

	}

}
