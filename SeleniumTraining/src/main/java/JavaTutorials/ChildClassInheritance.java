package JavaTutorials;

public class ChildClassInheritance extends ParentClassInheriance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassInheritance obj1 = new ChildClassInheritance();
		
		ParentClassInheriance obj2 = new ParentClassInheriance();
		
		ParentClassInheriance obj3 = new ChildClassInheritance();
		
		ChildClassInheritance obj4 = (ChildClassInheritance) new ParentClassInheriance();
		
		// Child Class Reference + Child Obj  - Type 1
		// Child + Parent Methods 
		obj1.ChildMethod1();
		obj1.ChildMethod2();
		obj1.ParentMethod1();
		obj1.ParentMethod2();
		
		//Parent Class Reference + Parent Obj  - Type 2
		//Parent + Parent Methods 
		
		obj2.ParentMethod1();
		obj2.ParentMethod2();
		
		//Parent Class Reference + Child Obj  - Type 3
		//Parent + Parent Methods 
		
		obj3.ParentMethod1();
		obj3.ParentMethod2();
		
		//Child Class Reference + Parent Obj  - Type 4
		// Run time Error	
		
	}

	public void ChildMethod1() {

		System.out.println("Child Method 1");
	}

	public void ChildMethod2() {

		System.out.println("Child Method 2");
	}

}
