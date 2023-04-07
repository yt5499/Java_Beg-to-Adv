package varndatatypes;

//	creating public constant and using it
public class PublicConst {

	public static final int months = 12;
	//		public static final double pi = (double) 22/7;			
	public static final double pi = (double)22/7;		//use this instead of above line to get perfect output

	public static void main(String[] args) {

		System.out.println("Months: "+months);
		System.out.printf("PI: %.3f",pi);

	}

}
