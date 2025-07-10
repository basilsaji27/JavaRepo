package MultiLevelInheritance;

public class Child extends Parent {
	public void child() {
		System.out.println("Child Class!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.grandParent();
		obj.parent();
		obj.child();
	}

}
