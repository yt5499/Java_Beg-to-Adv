package oprnexpr;

import java.util.Scanner;

//	convert total days to year, months, weeks & days
public class Covert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day;
		float year, months, weeks;
		
		System.out.println("Enter days: ");
		day = sc.nextInt();
		
		year = day/365;
		day = day%365;
		
		months = day/30;
		day = day%30;
		
		weeks = day/7;
		day = day%7;
		
		System.out.println("years: "+year);
		System.out.println("months: "+months);
		System.out.println("weeks: "+weeks);
		System.out.println("days: "+day);
		
	}

}
