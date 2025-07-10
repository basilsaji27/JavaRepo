package exceptionsdemo;

public class SamplePgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s1 = null;
			System.out.println(s1.length());
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception Handling......");
		}
		/*catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointer exception handling......");
		}*/
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException handling.............");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Parent Exception..........");
		}

	}

}
