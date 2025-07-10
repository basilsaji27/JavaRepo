package accessmodifers1;

import accessmodifiers.Access;

public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access2 obj = new Access2();
		Access obj1 = new Access();	//HAS-A relationship
		obj1.publicDisplay();
		//obj.publicDisplay(); //error due to extending
		//obj.protectedDisplay(); //error due to extending
	}

}
