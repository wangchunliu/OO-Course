package model;


import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private String tsex;
	private Integer tage;
	private String tdept;
	private String tpassword;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	
	/** full constructor */
	public Teacher(Integer tid, String tname, String tsex, Integer tage,
			String tdept, String tpassword) {
		this.tid = tid;
		this.tname = tname;
		this.tsex = tsex;
		this.tage = tage;
		this.tdept = tdept;
		this.tpassword = tpassword;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsex() {
		return this.tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public Integer getTage() {
		return this.tage;
	}

	public void setTage(Integer tage) {
		this.tage = tage;
	}

	public String getTdept() {
		return this.tdept;
	}

	public void setTdept(String tdept) {
		this.tdept = tdept;
	}

	public String getTpassword() {
		return this.tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

}