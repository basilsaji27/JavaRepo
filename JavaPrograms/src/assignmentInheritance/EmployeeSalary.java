package assignmentInheritance;

import java.util.Scanner;

public class EmployeeSalary {
	
	double basicpay;
	double deduction;
	double bonus;

	public void getSalaryInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Basic Pay of Employee : ");
		basicpay = sc.nextDouble();
		System.out.print("Enter the Deduction Amount of Employee : ");
		deduction = sc.nextDouble();
		System.out.print("Enter the Bonus Amount of Employee : ");
		bonus = sc.nextDouble();
		sc.close();

	}

}
