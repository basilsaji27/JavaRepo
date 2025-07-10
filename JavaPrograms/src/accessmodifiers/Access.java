package accessmodifiers;

public class Access {
	public int a=10;
	private int b =20;
	protected int c = 30;
	int d = 40;
	public void publicDisplay() {
		System.out.println("Public Method....");
	}
	private void privateDisplay() {
		System.out.println("Private Method....");
	}
	protected void protectedDisplay() {
		System.out.println("Protected Method.....");
	}
	void defaultDisplay() {
		System.out.println("Default method.........");
	}
	
	public static void main(String[] args) {
		Access obj = new Access();
		obj.publicDisplay();
		obj.privateDisplay();
		obj.protectedDisplay();
		obj.defaultDisplay();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
