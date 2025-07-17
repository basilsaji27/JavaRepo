package assignmentAbstraction;

public class Contractor extends Employee{
	private int paymentPerHour;
    private int workingHours;

    public Contractor(int paymentPerHour, int workingHours) {
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Variable Salary = "+(paymentPerHour*workingHours));
	}

}
