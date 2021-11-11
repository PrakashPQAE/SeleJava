package JavaPrograms;

import java.util.Map.Entry;
import java.util.Set;

import JavaTutorials.HashMap;

public class CountOfOccurancesOfDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "WelcomeToTheJungle";

		char[] allChars = s.toCharArray();

		java.util.HashMap<Character,Integer> hm = new java.util.HashMap<Character,Integer>();

		for (char c : allChars) {

			if(hm.containsKey(c)) {

				hm.put(c, hm.get(c)+1);

			}
			else {

				hm.put(c, 1);
			}

		}

		Set<Entry<Character,Integer>> allEntries= hm.entrySet();

		for (Entry<Character, Integer> entry : allEntries) {

			if(entry.getValue()>=1) {

				System.out.println(entry.getKey() + "   "+entry.getValue());
			}		

		}
		
		// All duplicates are converted into array
		Set<Character> allKeys =  hm.keySet();

		System.out.println(allKeys);

		Object[] a =  allKeys.toArray();

		for (Object eachobject : a) {

			System.out.println(eachobject);

		}

	}

}
