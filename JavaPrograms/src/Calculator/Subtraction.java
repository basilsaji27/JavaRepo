package Calculator;

public class Subtraction extends Addition{
	public void subtraction(int n1, int n2) {
		int diff = n1 - n2;
		System.out.println("The Difference is : "+diff);
	}
	
	public void product(int n1, int n2) {
		int prod = n1 * n2;
		System.out.println("The Product is : "+prod);
	}
	
	public void division(int n1, int n2) {
		float div = n1 / n2;
		System.out.println("The Division is : "+div);
	}
}
