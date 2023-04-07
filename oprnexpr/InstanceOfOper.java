package oprnexpr;

//	using instance(object)of operator

class abc {
	abc() {
		System.out.println("Object is created");
	}
}

class xyz {
	xyz() {
		System.out.println("Object2 is created");
	}
}

public class InstanceOfOper {

	public static void main(String[] args) {
		
//		creating obj of class abc
		abc a = new abc();
		
		if(a instanceof abc) {
			System.out.println("a is instance of class abc");
		}
		else {
			System.out.println("a is not a instance of class abc");
		}

	}

}
