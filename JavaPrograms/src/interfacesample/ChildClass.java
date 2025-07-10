package interfacesample;

public class ChildClass implements SampleInterface1, SampleInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.display1();
		obj.display2();

	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is method from 2nd Abstract class");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("This is method from 1st Abstract class");
	}

}
