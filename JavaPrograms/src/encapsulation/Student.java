package encapsulation;

public class Student {
	private int sid;
	private String sname;
	public void setData(int sid, String sname) { //for setting the parameter values
		this.sid = sid;
		this.sname = sname;
	}
	
	public void getData() {
		System.out.println(sid+" "+ sname);
	}

}
