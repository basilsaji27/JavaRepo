package SampleString;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("Java");
		StringBuffer s2 = new StringBuffer("Malayalam");
		StringBuffer temp1 = s1.reverse();
		StringBuffer temp2 = s2.reverse();
		if (s1.equals(temp1)) {
			System.out.println(s1+" is palindrome");
		}
		else {
			System.out.println(s1+" is not palindrome");
		}
	}

}
