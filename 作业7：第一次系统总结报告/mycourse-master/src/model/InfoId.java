package model;

import java.io.Serializable;

public class InfoId implements Serializable {
	private int sid;
	private int cid;
	private int tid;
	
	public InfoId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InfoId(int sid, int cid, int tid) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "InfoId [sid=" + sid + ", cid=" + cid + ", tid=" + tid + "]";
	}
	
	
	

}
