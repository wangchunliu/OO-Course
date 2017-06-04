package model;



public class Course implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cid;
	private String cname;

	
	
	
	public Course() {
		
	}

	public Course(Integer cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	

	
}