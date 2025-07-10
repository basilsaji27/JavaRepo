package SampleString;

public class SampleStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Java Programming");
		System.out.println(s);
		System.out.println(s.append("2025"));
		System.out.println(s);
		System.out.println(s.insert(4, "script"));
		System.out.println(s.delete(4, 10));
		System.out.println(s.replace(16, 20, "XLXL"));
		System.out.println(s.reverse());
		System.out.println(s);
	}

}
