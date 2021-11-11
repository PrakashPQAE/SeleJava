package JavaPrograms;

import java.util.Iterator;

import JavaTutorials.TreeSet;

public class RemoveDuplicatesUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,1,1,3,3,3,4,4,4,5,5,5};

		java.util.TreeSet<Integer> ts = new java.util.TreeSet<Integer>();

		for(int i = 0; i< a.length -1;i++) {

			ts.add(a[i]);
		}

		Object[] arr = ts.toArray();

		for (Object object : arr) {

			System.out.println(object);
		}

	}

}
