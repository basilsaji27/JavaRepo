package assignmentSuper;

import java.util.Scanner;

public class DivisibleCheck extends AdditionOfTwoNos{

	public DivisibleCheck(int num1, int num2) {
		int sum = super.addition(num1, num2);
		System.out.println("The Sum of two numbers "+num1+" & "+num2+" = "+sum);
		if (sum%10 ==0) {
			System.out.println(sum + " is divisible by 10");
		}
		else {
			System.out.println(sum + " is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		DivisibleCheck d1 = new DivisibleCheck(num1, num2);
		sc.close();
	}

}
