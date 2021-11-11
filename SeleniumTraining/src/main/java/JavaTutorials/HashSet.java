package JavaTutorials;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {

		java.util.HashSet<Integer> hs = new java.util.HashSet<Integer>();

		hs.add(1);
		hs.add(4);
		hs.add(2);
		hs.add(3);		
		hs.add(1);
				
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		System.out.println(hs.contains(4));
		
		System.out.println(hs.remove(1));			

		Iterator<Integer> allValues= hs.iterator();

		while (allValues.hasNext()) {

			System.out.println(allValues.next());
		}
		
		hs.clear();
		
		Iterator<Integer> allValues1= hs.iterator();
		
		while (allValues1.hasNext()) {

			System.out.println("Elements after clearing  "+allValues1.next());
		}		
		
	}

}
