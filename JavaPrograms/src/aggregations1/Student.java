package aggregations1;

import aggregations2.Address;

public class Student {
	//String sName = "BSL";
	//int sId = 001;
	String sName;
	int sId;
	Address ag; //HAS-A relation
	public Student(String sName, int sId, Address ag) {
		this.sName = sName;
		this.sId = sId;
		this.ag = ag;
	}
	public void StudentDetails() {
		System.out.println("Name: "+sName);
		System.out.println("Id: "+sId);
		System.out.println("Flat No: "+ag.fNo);
		System.out.println("Flat Name: "+ag.fName);
		System.out.println("Place: "+ag.fPlace);
		System.out.println("Landmark: "+ag.fLandmark);
		System.out.println("Pincode: "+ag.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address(1208,"Rose","Kazhakuttam","TVM",686691);
		Student s1 = new Student("BAS",10, a1);
		s1.StudentDetails();
		Address a2 = new Address(125,"Arena","Petta","QLM",686555);
		Student s2 = new Student("GH",121, a2);
		s2.StudentDetails();
		//Address a1 = new Address(1208,"Rose","Kazhakuttam","TVM",686691);
		//a1.addressDetails();
	}

}

//Name: BSL
//Id: 1
//Flat No: 1207
//Flat Name: Orchid
//Place: Menamkulam
//Landmark: Kazhakkoottam
//Pincode: 686661
