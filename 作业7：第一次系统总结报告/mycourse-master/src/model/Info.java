package model;

import java.io.Serializable;

public class Info implements Serializable {

	private InfoId infoId;

	public Info() {
	}
	
	public Info(InfoId infoId) {
		this.infoId = infoId;
	}

	public InfoId getInfoId() {
		return infoId;
	}

	public void setInfoId(InfoId infoId) {
		this.infoId = infoId;
	}

	@Override
	public String toString() {
		return "Info [infoId=" + infoId + "]";
	}

	
	
}
