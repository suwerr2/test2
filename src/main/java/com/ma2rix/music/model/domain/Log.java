package com.ma2rix.music.model.domain;

import java.io.Serializable;

import org.joda.time.DateTime;

public class Log implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int logNo;
	private String actMenu;
	private int memberNo;
	private String actResult;
	private String actIp;
	private DateTime regDateTime;
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Log(int logNo, String actMenu, int memberNo,
			String actResult, String actIp, DateTime regDateTime) {
		super();
		this.logNo	 = 	logNo;
		this.actMenu = 	actMenu;
		this.memberNo = memberNo;
		this.actResult = 	actResult;
		this.actIp = 	actIp;
		this.regDateTime = regDateTime;
	}
	public int getLogNo() {
		return logNo;
	}
	public void setLogNo(int logNo) {
		this.logNo = logNo;
	}
	public String getActMenu() {
		return actMenu;
	}
	public void setActMenu(String actMenu) {
		this.actMenu = actMenu;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getActResult() {
		return actResult;
	}
	public void setActResult(String actResult) {
		this.actResult = actResult;
	}
	public DateTime getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}
	public String getActIp() {
		return actIp;
	}
	public void setActIp(String actIp) {
		this.actIp = actIp;
	}

	
}
