package exceptionsdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("file.txt");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File is not existing.");
		}
		

	}

}
