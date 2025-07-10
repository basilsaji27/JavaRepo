package abstraction;

public class Sample extends AbstractSample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractSample obj = new Sample(); //creating reference of abstract class.
		obj.abstractDisplay();
		obj.display();
		//obj.t
		//we cannot invoke child class properties by creating parent class reference.
		//obj.display();
	}

	@Override
	public void abstractDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class method!");
	}
	
	public void display() {
		System.out.println("Normal class method!");
		super.display();
	}
	
	public void test() {
		System.out.println("Test");
	}

}
