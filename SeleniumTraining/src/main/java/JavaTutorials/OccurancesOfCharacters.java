package JavaTutorials;

import java.util.Map.Entry;
import java.util.Set;

public class OccurancesOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome Back Home";

		char[] allChars = str.toCharArray();

		System.out.println(allChars.length);

		java.util.HashMap<Character, Integer> hm =  new java.util.HashMap<Character,Integer>();

		for (char c : allChars) {

			if(hm.containsKey(c)) {

				hm.put(c, hm.get(c)+1);	
			}
			else {
				hm.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> allEntries = hm.entrySet();

		for (Entry<Character, Integer> entry : allEntries) {

			if(entry.getKey().equals(' ')) {
				
				System.out.println("Spaces not included");
			}else {
				
				System.out.println(entry.getKey()+ " "+ entry.getValue());	
			}
		}

	}

}
