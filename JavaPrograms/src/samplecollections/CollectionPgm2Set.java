package samplecollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionPgm2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		System.out.println(s1);
		s1.add("Apple");
		System.out.println(s1);
		s1.add("Banana");
		s1.add("Orange");
		s1.add("Banana");
		s1.add("Cherry");
		System.out.println(s1);
		
		Set<String> s2 = new HashSet<String>();
		s2.add("Pappaya");
		s2.add("Berry");
		//System.out.println(s2);
		s2.addAll(s1);
		System.out.println(s2);
		//System.out.println(s1.contains("Berry"));
		//System.out.println(s1.contains("Orange"));
		//System.out.println(s2.containsAll(s1));
		s1.remove("Banana");
		System.out.println(s1);
		//System.out.println(s1.remove("Banana"));
		//System.out.println();
		s1.clear();
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		
		Iterator<String> i1 = s2.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println(s2);
		
		System.out.println("Creating List!..............");
		List<String> l1 = new LinkedList<String>();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Cherry");
		System.out.println(l1);
		
	}

}
