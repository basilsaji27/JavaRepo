package aggregations2;

public class Address {
	//int fNo = 1207;
	//String fName = "Orchid";
	//String fPlace = "Menamkulam";
	//String fLandmaark = "Kazhakkoottam";
	//int pincode = 686661;
	public int fNo;
	public String fName;
	public String fPlace;
	public String fLandmark;
	public int pincode;
	public Address(int fNo,String fName,String fPlace,String fLandmark,int pincode) {
		this.fNo = fNo;
		this.fName = fName;
		this.fLandmark = fLandmark;
		this.fPlace = fPlace;
		this.pincode = pincode;
	}
	public void addressDetails() {
		System.out.println("Flat No: "+fNo);
		System.out.println("Flat Name: "+fName);
		System.out.println("Place: "+fPlace);
		System.out.println("Landmark: "+fLandmark);
		System.out.println("Pincode: "+pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
