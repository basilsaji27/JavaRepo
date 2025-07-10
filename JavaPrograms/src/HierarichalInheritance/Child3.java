package HierarichalInheritance;

public class Child3 extends Parent{
	public void childClass3() {
		System.out.println("Child class 3............");
	}
	
	public static void main(String[] args) {
		Child3 obj = new Child3();
		obj.childClass3();
		obj.parentClass();
	}
}
