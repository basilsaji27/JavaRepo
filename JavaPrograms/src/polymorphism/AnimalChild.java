package polymorphism;

public class AnimalChild extends AnimalParent{
	
	@Override
	public void display() {
		System.out.println("This is Animal Child class");
	}
	
	public void Arithemetic(int a, int b) {
		int sub = a-b;
		System.out.println("Difference = "+sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalParent obj1 = new AnimalParent();
		obj1.Arithemetic(10, 20);
		AnimalChild obj2 = new AnimalChild();
		obj2.Arithemetic(20, 10);
		AnimalParent obj = new AnimalChild(); //upcasting
		obj.Arithemetic(40, 20);

	}

}
