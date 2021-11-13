package JavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,2,2,3,3,3,4,5,6};
		
		 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i : a) {
			
			if(hm.containsKey(i)) {
				
				hm.put(i, hm.get(i)+1);				
			}
			else {
				
				hm.put(i, 1);
				
			}
		}
		
		Set<Entry<Integer,Integer>> allEntries = hm.entrySet();
		
		java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
		
		for (Entry<Integer, Integer> entry : allEntries) {
			
			if(entry.getValue()>1) {
				
				System.out.println("Duplicate Elements are : "+ entry.getKey() +"  ----- " + entry.getValue()+ " Times");
				
				al.add(entry.getKey());
			} 			
		}
		
		System.out.println("Removed duplicate Elements are converted to list --> "+al);
		
	}

}
