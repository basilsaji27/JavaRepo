package assignmentInheritance;

public class SalaryCalculator extends EmployeeSalary{
	double hra;
	double pf;
	public void calculateSalary() {
		// TODO Auto-generated method stub
		hra = 0.05 * basicpay;
		pf = 0.20 * basicpay;
	}
}
