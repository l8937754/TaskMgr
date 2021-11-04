package com.TaskMgr.bean;

import java.io.Serializable;

public class SelectList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tkey;
	private String tvalue;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SelectList() {
		super();
	}
	public SelectList(String tkey, String tvalue) {
		super();
		this.tkey = tkey;
		this.tvalue = tvalue;
	}
	public String getTkey() {
		return tkey;
	}
	public void setTkey(String tkey) {
		this.tkey = tkey;
	}
	public String getTvalue() {
		return tvalue;
	}
	public void setTvalue(String tvalue) {
		this.tvalue = tvalue;
	}

}
