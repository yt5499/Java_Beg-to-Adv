package iterations;

public class LableBreak {

	public static void main(String[] args) {
		
		outer:for(int i=1;i<=10;i++) {
			inner:for(int j=1;j<=10;j++) {
				if(i==j) {
					break inner;
				}
				System.out.println(j);
				if(i==5) {
					break outer;
				}
			}
		}

	}

}
