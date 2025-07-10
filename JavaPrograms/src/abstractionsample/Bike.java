package abstractionsample;

public class Bike extends Vehicle{
	public void display() {
		System.out.println("Model : RE CLassic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Bike();
		obj.display();
		obj.functions();
	}

}
