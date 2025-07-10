package exceptionsdemo;

public class SampleThrowExceptionPgm2 {
	public static void checkAge(int age) throws SampleCustomException{
		if (age>=18) {
			System.out.println("Eligible for Voting...");
		}
		else {
			throw new SampleCustomException("Age is below 18. So, not eligible for Voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SampleThrowExceptionPgm2 obj = new SampleThrowExceptionPgm2();
		
		try {
			SampleThrowExceptionPgm2.checkAge(18);
			SampleThrowExceptionPgm2.checkAge(12);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Age is below 18. So, not eligible for Voting");
		}
	}

}
