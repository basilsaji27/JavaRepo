package abstraction;

public class Sample2 extends SampleAbstract1{
	
	public static void main(String[] args) {
		Sample2 obj = new Sample2();
		obj.display();
		obj.details();
		obj.present();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sample Text");
		
	}
	
	public void present() {
		System.out.println("This is normal child class method");
	}

}
