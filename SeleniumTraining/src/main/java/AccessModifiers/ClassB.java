package AccessModifiers;

public class ClassB {
	
	
	public void A() {
		
		System.out.println("ClassB");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassA obj = new ClassA(); // Private members cannot be access outside of the class
		
		ClassA obj = new ClassA(2); // Protected members can be accessed outside of the class within same package
		
		ClassA obj1 = new ClassA(2,6); // default members can be accessed outside of the class within same package
		
		
		

	}

}
