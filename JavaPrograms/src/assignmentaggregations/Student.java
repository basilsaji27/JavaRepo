package assignmentaggregations;

public class Student {
	String name;
	int rollno;
	Address ads;
	
	public Student(String name, int rollno, Address ads) {
		this.name = name;
		this.rollno = rollno;
		this.ads = ads;
	}
	
	public void StudentDetails() {
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollno);
		System.out.println("Flat No: "+ads.flatNo);
		System.out.println("Flat Name: "+ads.flatName);
		System.out.println("Place: "+ads.place);
		System.out.println("Landmark: "+ads.landmark);
		System.out.println("Pincode: "+ads.pincode);
	}
	
	public static void main(String[] args) {
		Address a1 = new Address(1207, "Orchid", "Menamkulam", "Kazhakkuttam", 686551);
		Student s1 = new Student("BASIL",1201, a1);
		s1.StudentDetails();
		System.out.println();
		Address a2 = new Address(1204, "Rose", "Kulathoor", "Near Phase 3", 686553);
		Student s2 = new Student("Anandhu",1212, a2);
		s2.StudentDetails();
	}
	
}
