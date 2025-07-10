package HierarichalInheritance;

public class Child1 extends Parent{
	public void childClass1() {
		System.out.println("Child Class 1..............");
	}
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.childClass1();
		obj.parentClass();
	}
}
