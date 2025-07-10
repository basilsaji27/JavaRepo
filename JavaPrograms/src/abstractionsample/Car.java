package abstractionsample;

public class Car extends Vehicle{
	public void display() {
		System.out.println("Model : Honda");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.display();
		c1.functions();
	}

}
//create abtract class Google and acreate abstract method search and normal method display for displaying text
//create child classses as All, Images, shopping etc and invoke absract method and respective child class.