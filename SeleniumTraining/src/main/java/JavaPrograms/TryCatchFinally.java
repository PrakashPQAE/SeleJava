package JavaPrograms;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(returnString());
				
	}
	
	@SuppressWarnings("finally")
	public static String returnString() {
		
		try {
			
			System.out.println("Inside try Block");
			
			//System.exit(1);
			
			return "abc";
			
			
		} catch (Exception e) {
			 
			System.out.println("Exception Caught");
			
		}finally {
			
			return "Outer Try block";
			
		}	
	}
}
