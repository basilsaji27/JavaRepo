package exceptionsdemo;

import java.util.Scanner;

public class SampleInputRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = s1.nextInt();
		System.out.println("Enter the name : ");
		String s = s1.nextLine();
		
		System.out.println("Entered number is "+num);
		
		
		System.out.println("ENtered String is "+s);
	}

}
