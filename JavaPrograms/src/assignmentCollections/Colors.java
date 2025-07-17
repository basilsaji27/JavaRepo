package assignmentCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {
		//Write a Java program to create a new array list, add some colors (string) and print out the collection.
		List<String> l1 = new ArrayList<String>();
		l1.add("Black");
		l1.add("White");
		l1.add("Red");
		l1.add("Green");
		l1.add("Blue");
		l1.add("Yellow");
		System.out.println(l1);
		System.out.println();
		
		//Write a Java program to retrieve an element (at a specified index) from a given array list. 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the index position to be retrieved : ");
		int index = sc.nextInt();
		System.out.println("The Element at the given index position "+index+" is : "+ l1.get(index));
		System.out.println();

		//Write a Java program to iterate through all elements in a array list.
		System.out.println("The Elements of the ArrayList are:");
		for (String c1 : l1) {
			System.out.println(c1);
		}
		System.out.println();

		//Write a Java program to remove the third element from a array list.
		l1.remove(3);
		System.out.println("The ArrayList after removing the third element is : "+l1); 
		System.out.println();

		//Write a Java program to search an element in a array list
		System.out.print("Enter the element to be searched : ");
		String src = sc.next();
		System.out.println(l1.contains(src));
		
		sc.close();
	}

}
