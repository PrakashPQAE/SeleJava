package JavaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicatesUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7};
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<a.length-1; i++) {			
			
			if(hm.containsKey(a[i])) {
				
				hm.remove(a[i]);
			}
			else {
				
				hm.put(a[i], 1);
			}
		}

		Set<Entry<Integer,Integer>>	allEntries = hm.entrySet();
		
		for (Entry<Integer, Integer> entry : allEntries) {
			
			System.out.println(entry.getKey());
			
		}		

	}

}
