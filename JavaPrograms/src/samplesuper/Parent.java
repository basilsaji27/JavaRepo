package samplesuper;

public class Parent {
	int a=10;
	int b=10;
	Parent(){
		System.out.println("Parent default constructor..........");
	}
	Parent(int a, int b){
		this();
		System.out.println("Parameterised constructors" + a+ "and"+ b);
	}
	public void sumParent() {
		int sum = a+b;
		System.out.println("The Sum is : "+sum);
	}
	public void display() {
		System.out.println("Java Progrmming");
	}
}
