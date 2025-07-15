package assignmentInheritance;

public class PaySlip extends SalaryCalculator{
	double totalSalary;
	public void calculateTotalSalary() {
		totalSalary = basicpay + hra - pf - deduction + bonus;
	}
	public void salarySlip() {
		System.out.println("Salary Slip");
		System.out.println("Basic Pay : "+basicpay);
		System.out.println("Deduction : "+deduction);
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("Bonus : "+bonus);
		System.out.println("Total Salary in Hand : "+totalSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaySlip emp1 = new PaySlip();
		emp1.getSalaryInfo();
		emp1.calculateSalary();
		emp1.calculateTotalSalary();
		emp1.salarySlip();

	}

}
