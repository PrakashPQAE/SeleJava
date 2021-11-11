package Inheritance;

public class Child1 extends Parent {

	public void childMethod() {

		System.out.println("Child Method");
	}


	public void childMethod1() {

		System.out.println("Child Method");
	}

	public void childMethod2() {

		childMethod1();

		System.out.println("Child Method");
	}

	public static void childMethod23() {

		 

		System.out.println("Child Method");
	}
	/*//Dynamic Binding
	 * public void parentMethod() {
	 * 
	 * System.out.println("Child Method"); }
	 */

	public static void main(String[] args) {

		Child1 obj = new Child1();

		obj.childMethod();
		// obj.parentMethod();

		Parent obj1 = new Child1();  //Dynamic Binding

		//obj1.childMethod(); //parent method		
		Child1 c1 = (Child1) new Parent();

		c1.childMethod();



	}

}
