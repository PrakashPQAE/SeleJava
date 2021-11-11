package JavaTutorials;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7,7};
		
		for (int i : a) {
			
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		Object[] obj = {1, "Test", true};
		
		for (Object object : obj) {
			
			System.out.println(object);
		}

	}

}
