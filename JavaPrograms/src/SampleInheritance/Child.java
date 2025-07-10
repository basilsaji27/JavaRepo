package SampleInheritance;

public class Child extends Parent {
	
	public void child() {
		System.out.println("Child CLass!!!");
	}
	public static void main(String[] args){
		Child obj = new Child();
		obj.child();
		obj.parent();
		obj.display();
	}

}
