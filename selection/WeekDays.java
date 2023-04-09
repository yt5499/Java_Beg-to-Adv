package selection;

import java.util.Scanner;

//		showing day name by number from 1 to 7
//		using else-if ladder
public class WeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day;
		
		System.out.print("Enter number from 1 to 7: ");
		day = sc.nextInt();
		
		System.out.println();
		
		if(day==1) {
			System.out.println("Monday");
			System.out.println("Get back to the work");
		}
		else if (day==2) {
			System.out.println("Tuesday");
		}
		else if (day==3) {
			System.out.println("Wednesday");
		}
		else if (day==4) {
			System.out.println("Thursday");
		}
		else if (day==5) {
			System.out.println("Friday");
		}
		else if (day==6) {
			System.out.println("Saturday");
		}
		else if (day==7) {
			System.out.println("Sunday");
			System.out.println("Enjoy the holiday!");
		}
		else {
			System.out.println("Invalid entry!");
		}

	}

}
