package samplesuper;

public class Child extends Parent{
	int a = 30;
	int b=20;
	Child(){
		super(20,30);
		System.out.println("Child default constructor.............");
	}
	public void childSum() {
		super.sumParent();
		super.display();
		this.display1();
		int sum = super.a+super.b;
		System.out.println("The child sum :"+sum);
	}
	public void display1() {
		System.out.println("Programming......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.childSum();
		
	}

}
