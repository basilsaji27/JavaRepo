package assignmentPolymorphism;

import java.util.Scanner;

public class Onseason extends Offseason {
	public void discount(double actualPrice) {
		// TODO Auto-generated method stub
		double discountPrice = 0.4 * actualPrice;
		System.out.println("The On-season Discount Price = "+ discountPrice);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Actual price : ");
		double actualPrice = sc.nextDouble();
		Offseason a1 = new Offseason();
		a1.discount(actualPrice);
		Offseason a2 = new Onseason();
		a2.discount(actualPrice);
	}
}
