package varndatatypes;

//	declaring static variable at the end of class
public class declareVar2 {

	public static void main(String[] args) {
		
		declareVar2 obj = new declareVar2();
		obj.msg = "we can do that together";	//non-static
		System.out.println(obj.msg);

	}
	String msg;

}
