package JavaTutorials;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		java.util.TreeSet<Integer> ts = new java.util.TreeSet<Integer>();
		
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(6);
		ts.add(7);		
		ts.add(3);
		ts.add(5);
		
		Iterator<Integer> it = ts.iterator();		
		while(it.hasNext()) {
			
			System.out.print(it.next());	
			
		}
		System.out.println(" ");	
		
	Iterator<Integer> it1 = ts.descendingIterator();
		
		while(it1.hasNext()) {
			
			System.out.print(it1.next());
			
		}
	}

}
