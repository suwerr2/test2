package com.ma2rix.music.model.domain;

import org.joda.time.DateTime;

public class Rank{

	private static final long serialVersionUID = 1L;

	private int rankNo;	
	private DateTime regDateTime;
	private String rankName;
	private String rType;
	
	public Rank(){
		super();
		// TODO Auto-generated constructor stub		
	}
		
	public Rank(int rankNo, DateTime regDateTime, String rankName, String rType) {
		super();
		this.rankNo = rankNo;
		this.regDateTime = regDateTime;
		this.rankName = rankName;
		this.rType = rType;
	}
		
	public int getRankNo() {
		return rankNo;
	}
	public void setRankNo(int rankNo) {
		this.rankNo = rankNo;
	}
	public DateTime getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public String getrType() {
		return rType;
	}
	public void setrType(String rType) {
		this.rType = rType;
	}	

	
	
}
