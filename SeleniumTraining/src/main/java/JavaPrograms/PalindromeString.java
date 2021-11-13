package JavaPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "MADam";
		
		String s1 = s.toLowerCase();
		
		System.out.println(s1);
		
		char[] allC = s1.toCharArray();
		
		String rev = "";
		
		for(int i = allC.length - 1; i >=0; i--) {
			
			
			rev = rev+ allC[i];
		}

		System.out.println(rev);
		
		if(rev.equals(s1)) {
			
			System.out.println("Palindrome");
			
		}else {
			
			System.out.println("Not a palindrome");
			
		}
	}

}
