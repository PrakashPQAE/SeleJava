package JavaPrograms;

import java.io.IOException;

public class RemoveDuplicatesWithoutCollection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 
		String s = "QTETEAWQ";
		
		int counter = 0;
		
		char[] alChars = s.toCharArray();
		
		for (int i = 0; i < alChars.length; i++) {
			
			for(int j = i+1; j<alChars.length;j++) {
				
				if(alChars[i]==alChars[j]) {
					
					counter++;
					
					if(counter>0) {
						
						System.out.println(alChars[j]);
						
					}	
					
					//throw new NullPointerException();
					
				}					
			}			
		}	

	}

}
