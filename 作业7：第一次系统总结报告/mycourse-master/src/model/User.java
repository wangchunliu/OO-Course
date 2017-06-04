package model;

public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer sid;
	private Student student;
	private String password;

	
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}