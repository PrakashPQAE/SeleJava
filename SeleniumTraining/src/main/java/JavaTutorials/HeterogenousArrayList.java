package JavaTutorials;

public class HeterogenousArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.ArrayList<Object> aList = new java.util.ArrayList<Object>();
		
		aList.add(1);
		aList.add("Name");
		aList.add(true);
		
		for (Object object : aList) {
			
			System.out.println(aList.getClass().getSimpleName());
			
		}

	}

}
