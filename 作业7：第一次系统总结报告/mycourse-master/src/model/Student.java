package model;




public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer sid;
	private String sname;
	private String ssex;
	private Integer sage;
	private String sdept;
	private User user;


	
	
	public Student() {
		
	}

	
	
	public Student(Integer sid, String sname, String ssex, Integer sage,
			String sdept) {
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.sdept = sdept;
	}



	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public Integer getSage() {
		return this.sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSdept() {
		return this.sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex
				+ ", sage=" + sage + ", sdept=" + sdept + "]";
	}

	
}