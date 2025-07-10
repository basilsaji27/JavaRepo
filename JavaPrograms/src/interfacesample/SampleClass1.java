package interfacesample;

public class SampleClass1 implements SampleInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		SampleClass1 obj1 = new SampleClass1();
		obj1.sum();
		//reference creation
		SampleInterface obj = new SampleClass1();
		obj.sum();
		SampleInterface obj2 = new SampleInterface() {
			
			@Override
			public void sum() {
				// TODO Auto-generated method stub
				
			}
		};}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum = a + b;
		System.out.println("Sum = "+sum);
	}

}
