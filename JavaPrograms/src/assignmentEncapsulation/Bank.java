package assignmentEncapsulation;

public class Bank {
	private int pinNo;
	
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	// Method to validate pin
    public boolean validatePin() {
        return (pinNo == 1001 || pinNo == 1234 || pinNo == 1212);
    }

    // Method to withdraw money
    public void withdrawAmount(int amount) {
        if (validatePin()) {
            System.out.println("PIN is valid.");
            System.out.println("Amount " + amount + " has been withdrawn successfully.");
        } 
        else {
            System.out.println("Invalid PIN. Transaction declined.");
        }
    }

}
