package com.ma2rix.music.model.command;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * 댓글 리스트에 사용되는 command 클래스
 */

public class FanCommand implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int fanNo;
	private int fanMemberNo;
	private int musicMemberNo;
	private String musicClass;
	private int musicNo;
	private DateTime regDateTime;
	private int fanCount;
	private int fanHeartCount;
	private int loginMemberNo;
	
	public FanCommand(){
		super();
	}
	
	public FanCommand(int fanNo,int fanMemberNo,int musicMemberNo,String musicClass,int musicNo,DateTime regDateTime,int fanCount, int fanHeartCount, int loginMemberNo){
		super();
		this.fanNo =             fanNo;         
		this.fanMemberNo =       fanMemberNo;   
		this.musicMemberNo=     musicMemberNo; 
		this.musicClass=        musicClass;    
		this.musicNo=           musicNo;       
		this.regDateTime=       regDateTime;   
		this.fanCount=          fanCount;    
		this.fanHeartCount  =  fanHeartCount;
		this.loginMemberNo =loginMemberNo;
	}

	public int getFanNo() {
		return fanNo;
	}

	public void setFanNo(int fanNo) {
		this.fanNo = fanNo;
	}

	public int getFanMemberNo() {
		return fanMemberNo;
	}

	public void setFanMemberNo(int fanMemberNo) {
		this.fanMemberNo = fanMemberNo;
	}

	public int getMusicMemberNo() {
		return musicMemberNo;
	}

	public void setMusicMemberNo(int musicMemberNo) {
		this.musicMemberNo = musicMemberNo;
	}

	public String getMusicClass() {
		return musicClass;
	}

	public void setMusicClass(String musicClass) {
		this.musicClass = musicClass;
	}

	public int getMusicNo() {
		return musicNo;
	}

	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}

	public DateTime getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}

	public int getFanCount() {
		return fanCount;
	}

	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}

	public int getFanHeartCount() {
		return fanHeartCount;
	}

	public void setFanHeartCount(int fanHeartCount) {
		this.fanHeartCount = fanHeartCount;
	}

	public int getLoginMemberNo() {
		return loginMemberNo;
	}

	public void setLoginMemberNo(int loginMemberNo) {
		this.loginMemberNo = loginMemberNo;
	}
		
}
