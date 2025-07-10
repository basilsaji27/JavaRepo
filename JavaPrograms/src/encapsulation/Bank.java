package encapsulation;

public class Bank {
	private int upin;
	private float balance;
	public void setData(int upin, float balance) {
		this.upin = upin;
		this.balance = balance;
	}
	public void getData() {
		System.out.println("Account Balance : "+balance);
	}
}
