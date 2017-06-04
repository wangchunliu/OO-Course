package model;

import java.io.Serializable;

public class InfoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	private String sdept;
	private int cid;
	private String cname;
	private int tid;
	private String tname;
	public InfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InfoDTO(int sid, String sname, String ssex, int sage, String sdept,
			int cid, String cname, int tid, String tname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.sdept = sdept;
		this.cid = cid;
		this.cname = cname;
		this.tid = tid;
		this.tname = tname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "InfoDTO [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex
				+ ", sage=" + sage + ", sdept=" + sdept + ", cid=" + cid
				+ ", cname=" + cname + ", tid=" + tid + ", tname=" + tname
				+ "]";
	}
	
	
	
	
	
	
}
