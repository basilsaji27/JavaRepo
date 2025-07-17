package assignmentAbstraction;

import java.util.Scanner;

public class HDFC implements RBI{
	int maturityAmount;
	@Override
	public void recurringDeposit(int amount, int duration) {
		// TODO Auto-generated method stub
		maturityAmount = ((amount*duration*interestRate)/100);
		System.out.println(("The maturity amount after "+ duration+" is : "+maturityAmount));
	}
	
	public static void main(String[] args) {
		HDFC hb = new HDFC();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to be depositing: ");
		int amount = sc.nextInt();
		System.out.print("Enter the period of time customer depositing : ");
		int duration = sc.nextInt();
		hb.recurringDeposit(amount, duration);
		sc.close();
	}

}
