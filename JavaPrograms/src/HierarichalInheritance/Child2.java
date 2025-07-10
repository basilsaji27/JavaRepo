package HierarichalInheritance;

public class Child2 extends Parent{
	public void childClass2() {
		System.out.println("Child class 2............");
	}
	
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.childClass2();
		obj.parentClass();
	}
}
