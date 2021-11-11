package JavaPrograms;
import java.util.Arrays;

public class AnagramStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str1 = "madam";

			String str2 = "aammd";

			char[] allChars1= str1.toCharArray();

			char[] allChars2= str2.toCharArray();

			Arrays.sort(allChars1);

			Arrays.sort(allChars2);

			if(Arrays.equals(allChars1, allChars2)) {

				System.out.println("Anagram");
				
			}else {
				
				System.out.println("Not an Anagram");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			throw new NullPointerException();
			
		}
	}

}
