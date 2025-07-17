package assignmentAbstraction;

public class FullTimeEmployee extends Employee{
	int fixedSalary;

	public FullTimeEmployee(int fixedSalary) {
		// TODO Auto-generated constructor stub
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Fixed Salary = "+(fixedSalary*8));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c1 = new Contractor(400, 5);
		c1.calculateSalary();
		FullTimeEmployee f1 = new FullTimeEmployee(500);
		f1.calculateSalary();

	}


}
