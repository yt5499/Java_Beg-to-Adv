package varndatatypes;

//	declaring and using character variable
public class CharVar {

	public static void main(String[] args) {
		
		char ch1,ch2;
		ch1=88;		//ASCII value of 'X'
		ch2='Y';
		
		System.out.println("Character at ch1 = "+ch1+" and ch2 = "+ch2);
//		System.out.println(ch1+" "+ch2);
		
//		now increment ch1 by 1
		ch1 +=1;
		
		System.out.println("ch1 is incremented by 1");
		System.out.println("ch1: "+ch1);

	}

}
