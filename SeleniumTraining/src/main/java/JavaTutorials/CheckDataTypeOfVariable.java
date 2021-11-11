package JavaTutorials;

public class CheckDataTypeOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		
		String s ="Name";
		
		System.out.println(((Object)i).getClass().getSimpleName());
		
		System.out.println(s.getClass().getSimpleName());	
	}

}
