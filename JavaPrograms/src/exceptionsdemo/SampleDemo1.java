package exceptionsdemo;

public class SampleDemo1 {

	public static void main(String[] args) {
		//ZeroDivisionError Exception
		/*int a =10;
		//int b=0;
		int c = a/b;
		System.out.println(c);*/
		//Null Pointer Exception
		/*String s1 = null;
		System.out.println(s1.length());*/
		//ArrayindexOutOfBoundsException
		int arr[] = {10,20,30};
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
