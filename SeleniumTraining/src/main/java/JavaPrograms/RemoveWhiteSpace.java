package JavaPrograms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World One Two";
				
		String finalString = "";
		
		int counter = 0;
		
		char[] allchars = s.toCharArray();
		
		for(int i = 0; i<allchars.length;i++) {
			
			counter++;
			
			if(allchars[i] != ' ') {
				
				finalString = finalString + allchars[i];
				
			}else {
				System.out.println("Remove White space at "+counter);
			}
			
		}		
		
		System.out.println(finalString);

	}

}
