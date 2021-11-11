package JavaTutorials;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		
		String rev = "";
		
		char[] allChars = s.toCharArray();
		
		int totalSize = allChars.length;
		
		for(int i = totalSize-1; i>= 0;i--) {
						
			 rev = rev + allChars[i];			 			
		}
		
		System.out.println(rev);

	}

}
