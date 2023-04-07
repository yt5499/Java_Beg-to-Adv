package varndatatypes;

//create and use constant

public class ConstMethod {
	
	static final int months = 12;
//	static final double pi =  22/7;			
	static final double pi = (double)22/7;		//use this instead of above line to get perfect output

	public static void main(String[] args) {
		
		System.out.println("Months: "+months);
		System.out.printf("PI: %.3f",pi);

	}

}
