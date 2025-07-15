package assignmentaggregations;

public class Address {
	public int flatNo;
	public String flatName;
	public String place;
	public String landmark;
	public int pincode;
	
	public Address(int flatNo, String flatName, String place, String landmark,int pincode) {
		// TODO Auto-generated constructor stub
		this.flatNo = flatNo;
		this.flatName = flatName;
		this.place = place;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	
	private void addressDetails() {
		// TODO Auto-generated method stub
		System.out.println("Flat No: "+flatNo);
		System.out.println("Flat Name: "+flatName);
		System.out.println("Place: "+place);
		System.out.println("Landmark: "+landmark);
		System.out.println("Pincode: "+pincode);
	}

}
