package exceptionsdemo;

public class SampleExceptionPgm {
	public static void checkDivisible(int n1, int n2) throws MyException{
		int a = n1;
		int b = n2;
		if (b ==0) {
			throw new ArithmeticException("Zero not Divisibe");
		}
		else {
			System.out.println("Divisible");
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkDivisible(10, 0);
			checkDivisible(10, 2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Zero is not divisible");
		}

	}

}
