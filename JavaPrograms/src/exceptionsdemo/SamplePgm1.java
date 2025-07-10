package exceptionsdemo;

public class SamplePgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting!..............");
		try {
			System.out.println(10/0);
		} /*catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Zero is not divisible by any number");
		}*/
		finally {
			System.out.println("Must Read!.................");
		}
		System.out.println("Ending!................");

	}

}
