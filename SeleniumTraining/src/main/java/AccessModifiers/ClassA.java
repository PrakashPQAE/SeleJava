package AccessModifiers;

public class ClassA extends ClassB{

	private ClassA(){

		System.out.println("Private constructor");
	}

	protected ClassA(int a){

		System.out.println("Protected constructor");
	}

	ClassA(int b,int c){

		System.out.println("default constructor");
	}
	
	public void A() {
		
		System.out.println("ClassA");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassB b = new ClassA();
		
		b.A();
		
	}

}
