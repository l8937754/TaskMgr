package com.TaskMgr.bean;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TaskList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String customername;
	private String xtmc;
	private String gnmc;
	private String wtms;
	private String tcr;
	private Date tcrq;
	private String jjr;
	private Date wcrq;
	private String yyhfx;
	private String jjff;
	private String sfwc;
	private String rwzt;
	private String csr;
	private Date csrq;
	private String cssm;
	private String csjg;
	
	
	public TaskList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TaskList(int id, String customername, String xtmc, String gnmc, String wtms, String tcr, Date tcrq,
			String jjr, Date wcrq, String yyhfx, String jjff, String ffwc, String rwzt, String csr, Date csrq,
			String cssm, String csjg) {
		super();
		this.id = id;
		this.customername = customername;
		this.xtmc = xtmc;
		this.gnmc = gnmc;
		this.wtms = wtms;
		this.tcr = tcr;
		this.tcrq = tcrq;
		this.jjr = jjr;
		this.wcrq = wcrq;
		this.yyhfx = yyhfx;
		this.jjff = jjff;
		this.sfwc = ffwc;
		this.rwzt = rwzt;
		this.csr = csr;
		this.csrq = csrq;
		this.cssm = cssm;
		this.csjg = csjg;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getXtmc() {
		return xtmc;
	}
	public void setXtmc(String xtmc) {
		this.xtmc = xtmc;
	}
	public String getGnmc() {
		return gnmc;
	}
	public void setGnmc(String gnmc) {
		this.gnmc = gnmc;
	}
	public String getWtms() {
		return wtms;
	}
	public void setWtms(String wtms) {
		this.wtms = wtms;
	}
	public String getTcr() {
		return tcr;
	}
	public void setTcr(String tcr) {
		this.tcr = tcr;
	}
	public Date getTcrq() {
		return tcrq;
	}
	public void setTcrq(Date tcrq) {
		this.tcrq = tcrq;
	}
	public String getJjr() {
		return jjr;
	}
	public void setJjr(String jjr) {
		this.jjr = jjr;
	}
	public Date getWcrq() {
		return wcrq;
	}
	public void setWcrq(Date wcrq) {
		this.wcrq = wcrq;
	}
	public String getYyhfx() {
		return yyhfx;
	}
	public void setYyhfx(String yyhfx) {
		this.yyhfx = yyhfx;
	}
	public String getJjff() {
		return jjff;
	}
	public void setJjff(String jjff) {
		this.jjff = jjff;
	}
	public String getSfwc() {
		return sfwc;
	}
	public void setSfwc(String ffwc) {
		this.sfwc = ffwc;
	}
	public String getRwzt() {
		return rwzt;
	}
	public void setRwzt(String rwzt) {
		this.rwzt = rwzt;
	}
	public String getCsr() {
		return csr;
	}
	public void setCsr(String csr) {
		this.csr = csr;
	}
	public Date getCsrq() {
		return csrq;
	}
	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}
	public String getCssm() {
		return cssm;
	}
	public void setCssm(String cssm) {
		this.cssm = cssm;
	}
	public String getCsjg() {
		return csjg;
	}
	public void setCsjg(String csjg) {
		this.csjg = csjg;
	}


	@Override
	public String toString() {
		return " {id=" + id + ", customername=" + customername + ", xtmc=" + xtmc + ", gnmc=" + gnmc + ", wtms="
				+ wtms + ", tcr=" + tcr + ", tcrq=" + tcrq + ", jjr=" + jjr + ", wcrq=" + wcrq + ", yyhfx=" + yyhfx
				+ ", jjff=" + jjff + ", sfwc=" + sfwc + ", rwzt=" + rwzt + ", csr=" + csr + ", csrq=" + csrq + ", cssm="
				+ cssm + ", csjg=" + csjg + "}";
	}


}
