package JavaTutorials;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.ArrayList<String> alist=new java.util.ArrayList<String>();
		
		alist.add("Hello1");
		alist.add("Hello2");
		alist.add("Hello3");
		alist.add("Hello4");
		
		
			
		System.out.println(alist.get(2));
		
		System.out.println(alist.set(0, "Hello01"));
		
		System.out.println(alist.indexOf("Hello3"));
		
		System.out.println(alist.remove(2));
		
		System.out.println(alist);			
		
		Iterator i =alist.iterator();
		
		int count = 0;		
		while(i.hasNext()) {

			System.out.println("Values in aList at index " +count+" is "+ i.next());
			
			count++;			
		}
		
		for (String eachStringValue : alist) {
			
			System.out.println(eachStringValue);			
		}
		
		Object[] arr = alist.toArray();
		
		for(int j = 0;j<arr.length;j++) {
		
			System.out.println("Changed Array "+ arr[j]);
			
		}
		
		alist.clear();
		
		System.out.println(alist);
				
	}

}
