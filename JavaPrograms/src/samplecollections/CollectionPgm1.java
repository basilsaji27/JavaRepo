package samplecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		System.out.println(l1);
		//ArrayList<Integer> l2 = new ArrayList<Integer>();
		//LinkedList<Integer> l3 = new LinkedList<Integer>();
		//non-generic list creation
		//List l4 = new ArrayList();
		//list methods.
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Orange");
		l1.add("Banana");
		l1.add("Cherry");
		System.out.println(l1);
		l1.set(0, "Kiwi");
		l1.set(4, "Grape");
		System.out.println(l1);
		System.out.println(l1.get(3));
		System.out.println(l1.indexOf("Banana"));
		System.out.println(l1.lastIndexOf("Banana"));
		l1.remove(3);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Orange");
		l1.add("Banana");
		l1.add("Cherry");
		System.out.println(l1);
		//System.out.println(sort("Apple","Orange","Banana"));
		
	}

}
