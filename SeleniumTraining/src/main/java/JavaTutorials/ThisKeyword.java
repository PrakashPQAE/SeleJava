package JavaTutorials;

public class ThisKeyword {

	public ThisKeyword() {

		this("Stack");
		System.out.println("I am the constructor");
		
	}
	
	public ThisKeyword(String name) {
		
		System.out.println("I am parameterisec constructor "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword obj = new ThisKeyword();
		obj.executeThisMethodA();

	}

	public void executeThisMethodA() {		

		executeThisMethodB();
	}

	public void executeThisMethodB() {

		System.out.println("executeThisMethodB");

	}



}
