package varndatatypes;

import java.io.*;

//Reading data from keyboard using console class
public class ConsoleInput {

	public static void main(String[] args) {
		Console c = System.console();
		int n;
		
		System.out.println("Enter your number: ");
		n = Integer.parseInt(c.readLine());
		
		System.out.println("Your number is: "+n);

	}

}
