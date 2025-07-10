package MultiLevelInheritance;

public class GrandChild extends Child{
	public void grandChild() {
		System.out.println("Grand CHild!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild obj = new GrandChild();
		obj.grandChild();
		obj.child();
		obj.parent();
		obj.grandParent();
	}

}
