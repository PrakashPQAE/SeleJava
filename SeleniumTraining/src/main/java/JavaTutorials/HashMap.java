package JavaTutorials;
import java.util.*;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.HashMap<Integer,String> hm = new java.util.HashMap<Integer,String>();

		hm.put(200, "Success");
		hm.put(201, "Created");
		hm.put(400, "Bad Request");
		hm.put(415, "Unsupported Media File");
		hm.put(404, "Unsupported Media File");
		hm.put(400, "Good Request");
		hm.put(400, "Very Good Request");
		hm.put(400, "Super Good Request");

		System.out.println(hm);

		System.out.println(hm.entrySet());

		System.out.println(hm.keySet());
		
		System.out.println("Return only last element of same key: "+hm.get(400));
		
		Set<Integer> allKeys = hm.keySet();
		
		for (Integer integer : allKeys) {
			
			System.out.println(integer);
			
		}

		System.out.println(hm.values());
		
		Collection<String> allStrings= hm.values();
		
		for (String string : allStrings) {
			
			System.out.println(string);
		}
		
		Set<Entry<Integer, String>>  allEntries= hm.entrySet();

		for (Entry<Integer, String> entry : allEntries) {

			System.out.println(entry.getKey()+" "+entry.getValue());
			
			if(entry.getKey().equals(200)) {
				
				System.out.println(entry.getValue());		
			}
		}

		// Or 

		for (Map.Entry eachEntry : hm.entrySet()) {

			System.out.println(eachEntry.getKey()+" "+eachEntry.getValue());
		}

	}

}
