package varndatatypes;

import java.util.HexFormat;

//	using integer literal(feature of using underscore is available in jdk-7)
public class IntLiteral {

	public static void main(String[] args) {
		
		long a = 5248_4859_7845L;
		int hex = 0xE_25D8;
		int bin = 0b01110_0110000111101;
		
		System.out.println(a);
		System.out.println(hex);
		System.out.println(bin);

	}

}
