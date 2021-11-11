package JavaTutorials;

import java.util.Map.Entry;
import java.util.Set;

public class DuplicateAndOccurancesOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome Hello To Hello World";
		
		String[] allStrings = str.split(" ");
		
		java.util.HashMap<String, Integer> hm = new java.util.HashMap<String, Integer>();
		
		for (String eachString : allStrings) {
			
			if(hm.containsKey(eachString)) {
				
				hm.put(eachString, hm.get(eachString)+1);
				
			}
			else {
				
				hm.put(eachString, 1);
			}			
		}
		
		System.out.println(hm);
		
		
		Set<Entry<String,Integer>> allEntries = hm.entrySet();
		
		for (Entry<String, Integer> entry : allEntries) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+ " "+ entry.getValue());
				
			}
			
		}		

	}

}
