package JavaTutorials;

public class Sorting_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"Testingqa","Hellotesting","AboveTerm","Bestcode"};
		
		System.out.println("---------------Before Sorting-----------");
		
		for(int k = 0; k < s.length;k++) {				
			
			System.out.println(s[k]);
		}
		
		for(int i = 0;i < s.length; i++) {
			
			for(int j = 0; j< s.length-1;j++) {
				
				if(s[j].compareTo(s[j+1])>0) {
					
					String tempString = s[j];
					
					s[j] = s[j+1];
					
					s[j+1] = tempString;				
				}								
			}			
			
		}
		
		
		System.out.println("---------------After Sorting-----------");
		
		for(int k = 0; k < s.length;k++) {				
			
			System.out.println(s[k]);
		}

	}

}
