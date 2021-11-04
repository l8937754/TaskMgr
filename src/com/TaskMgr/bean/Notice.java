package com.TaskMgr.bean;

import java.io.Serializable;
import java.sql.Date;

public class Notice implements Serializable {
	private int Idno;
	private String changenotice;
	private String Recorder;
	private Date Recdate;
	public int getIdno() {
		return Idno;
	}
	public void setIdno(int id) {
		Idno = id;
	}
	public String getChangenotice() {
		return changenotice;
	}
	public void setChangenotice(String content) {
		changenotice = content;
	}
	public String getRecorder() {
		return Recorder;
	}
	public void setRecorder(String recorder) {
		Recorder = recorder;
	}
	public Date getRecdate() {
		return Recdate;
	}
	public void setRecdate(Date recdate) {
		Recdate = recdate;
	}
	
}
