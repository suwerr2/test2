package com.ma2rix.music.model.domain;

import org.joda.time.DateTime;

public class PerformPlayer {
	private int performNo;
	private int playerMemberNo;
	private String performPlayerStatus;
	private DateTime regDateTime;
	private DateTime modDateTime;
	public PerformPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PerformPlayer(int performNo, int playerMemberNo, String performPlayerStatus,
			DateTime regDateTime, DateTime modDateTime) {
		super();
		this.performNo = performNo;
		this.playerMemberNo = playerMemberNo;
		this.performPlayerStatus = performPlayerStatus;
		this.regDateTime = regDateTime;
		this.modDateTime = modDateTime;
	}
	public int getPerformNo() {
		return performNo;
	}
	public void setPerformNo(int performNo) {
		this.performNo = performNo;
	}
	public int getPlayerMemberNo() {
		return playerMemberNo;
	}
	public void setPlayerMemberNo(int playerMemberNo) {
		this.playerMemberNo = playerMemberNo;
	}
	public String getPerformPlayerStatus() {
		return performPlayerStatus;
	}
	public void setPerformPlayerStatus(String performPlayerStatus) {
		this.performPlayerStatus = performPlayerStatus;
	}
	public DateTime getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}
	public DateTime getModDateTime() {
		return modDateTime;
	}
	public void setModDateTime(DateTime modDateTime) {
		this.modDateTime = modDateTime;
	}
}
