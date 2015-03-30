package com.ma2rix.music.model.domain;

import java.io.Serializable;
import org.joda.time.DateTime;

public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int eventNo;       		//이벤트번호
	private String musicClass;  	//음원분류
	private int eventCnt;       	//횟수
	private String evFromDate;  	//시작일자
	private String evToDate;    	//종료일자
	private DateTime regDateTime; 	//등록일시

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(int eventNo, 
			String musicClass, 
			int eventCnt, 
			String evFromDate, 
			String evToDate, 
			DateTime regDateTime
) {
		super();
		this.eventNo = eventNo;
		this.musicClass = musicClass;
		this.eventCnt = eventCnt;
		this.evFromDate = evFromDate;
		this.evToDate = evToDate;
		this.regDateTime = regDateTime;
	}
	public int getEventNo() {
		return eventNo;
	}
	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}
	public String getMusicClass() {
		return musicClass;
	}
	public void setMusicClass(String musicClass) {
		this.musicClass = musicClass;
	}
	public int getEventCnt() {
		return eventCnt;
	}
	public void setEventCnt(int eventCnt) {
		this.eventCnt = eventCnt;
	}
	public String getEvFromDate() {
		return evFromDate;
	}
	public void setEvFromDate(String evFromDate) {
		this.evFromDate = evFromDate;
	}
	public String getEvToDate() {
		return evToDate;
	}
	public void setEvToDate(String evToDate) {
		this.evToDate = evToDate;
	}
	public DateTime getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}

	
}
