package JavaPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";

		String[] allStrings = s.split(" ");

		String finalReverse = "";

		for(int i = 0;i<allStrings.length;i++) {

			char[] allChars = allStrings[i].toCharArray();
			
			int size = allChars.length;

			for(int j = size -1 ;j>=0 ;j--) {

				finalReverse = finalReverse+allChars[j];
			}

		}
		
		System.out.println(finalReverse);
	}

}
