package JavaTutorials;

public class ConstructorChaining {

	public ConstructorChaining() {
		
		this("Stack");
		
		System.out.println("Default Constructor");

	}

	public ConstructorChaining(String name) {
		
		//this();
		
		System.out.println("Parameterized Constructor with name "+ name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChaining obj =  new ConstructorChaining();
		
		ConstructorChaining obj1 =  new ConstructorChaining("stack");
		
	}

}
