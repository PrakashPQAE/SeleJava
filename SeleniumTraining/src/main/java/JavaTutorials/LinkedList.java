package JavaTutorials;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.LinkedList<String> llist=new java.util.LinkedList<String>();

		llist.add("Hello1");
		llist.add("Hello2");
		llist.add("Hello3");
		llist.add("Hello4");
		
		
		System.out.println(llist.get(2));

		System.out.println(llist.set(0, "Hello01"));

		System.out.println(llist.indexOf("Hello3"));

		System.out.println(llist.remove(2));

		System.out.println(llist.getFirst());

		System.out.println(llist.getLast());


		System.out.println(llist.pollFirst());	

		System.out.println(llist.removeFirst());
		
		System.out.println(llist.removeLast());
		
		System.out.println("PollLast "+llist.pollLast());

		System.out.println(llist);			

		Iterator i =llist.iterator();

		int count = 0;		
		while(i.hasNext()) {

			System.out.println("Values in llist at index " +count+" is "+ i.next());

			count++;			
		}

		for (String eachStringValue : llist) {

			System.out.println(eachStringValue);			
		}

		Object[] arr = llist.toArray();

		for(int j = 0;j<arr.length;j++) {

			System.out.println("Changed Array "+ arr[j]);

		}

		llist.clear();

		System.out.println(llist);

	}

}
