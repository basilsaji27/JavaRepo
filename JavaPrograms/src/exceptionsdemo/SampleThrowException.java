package exceptionsdemo;

public class SampleThrowException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException("Zero not divisible");
		}
		else {
			System.out.println(a/b);
		}

	}

}
