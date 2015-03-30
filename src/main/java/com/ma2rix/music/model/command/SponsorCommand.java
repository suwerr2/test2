package com.ma2rix.music.model.command;

import java.io.Serializable;

import org.joda.time.DateTime;

public class SponsorCommand implements Serializable {

	
	private static final long serialVersionUID = 1L;	
	
	private int sponsorNo;
	private int memberNo;
	private int sponsorMemberNo;
	private int sponsorAmount;
	private DateTime regDatetime;
	private String memberUserid;
	private String memberName;
	private String memberNickName;
	private String memberRoute;
	private String memberImage;
	private String countyNo;
	private String memberCity;
	private String memberIntroduce;
	private String emailReceive;
	private int sponsorAmountAll;
	
	public SponsorCommand(){
		super();
	}
	
	public SponsorCommand(int sponsorNo, int memberNo, int sponsorMemberNo,
			int sponsorAmount, DateTime regDatetime, String memberUserid,
			String memberName, String memberNickName, String memberRoute,
			String memberImage, String countyNo, String memberCity,
			String memberIntroduce, String emailReceive, int sponsorAmountAll) {
		super();
		this.sponsorNo = sponsorNo;
		this.memberNo = memberNo;
		this.sponsorMemberNo = sponsorMemberNo;
		this.sponsorAmount = sponsorAmount;
		this.regDatetime = regDatetime;
		this.memberUserid = memberUserid;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.memberRoute = memberRoute;
		this.memberImage = memberImage;
		this.countyNo = countyNo;
		this.memberCity = memberCity;
		this.memberIntroduce = memberIntroduce;
		this.emailReceive = emailReceive;
		this.sponsorAmountAll = sponsorAmountAll;
	}

	
	public int getSponsorNo() {
		return sponsorNo;
	}

	public void setSponsorNo(int sponsorNo) {
		this.sponsorNo = sponsorNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getSponsorMemberNo() {
		return sponsorMemberNo;
	}

	public void setSponsorMemberNo(int sponsorMemberNo) {
		this.sponsorMemberNo = sponsorMemberNo;
	}

	public int getSponsorAmount() {
		return sponsorAmount;
	}

	public void setSponsorAmount(int sponsorAmount) {
		this.sponsorAmount = sponsorAmount;
	}

	public DateTime getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(DateTime regDatetime) {
		this.regDatetime = regDatetime;
	}

	public String getMemberUserid() {
		return memberUserid;
	}

	public void setMemberUserid(String memberUserid) {
		this.memberUserid = memberUserid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}

	public String getMemberRoute() {
		return memberRoute;
	}

	public void setMemberRoute(String memberRoute) {
		this.memberRoute = memberRoute;
	}

	public String getMemberImage() {
		return memberImage;
	}

	public void setMemberImage(String memberImage) {
		this.memberImage = memberImage;
	}

	public String getCountyNo() {
		return countyNo;
	}

	public void setCountyNo(String countyNo) {
		this.countyNo = countyNo;
	}

	public String getMemberCity() {
		return memberCity;
	}

	public void setMemberCity(String memberCity) {
		this.memberCity = memberCity;
	}

	public String getMemberIntroduce() {
		return memberIntroduce;
	}

	public void setMemberIntroduce(String memberIntroduce) {
		this.memberIntroduce = memberIntroduce;
	}

	public String getEmailReceive() {
		return emailReceive;
	}

	public void setEmailReceive(String emailReceive) {
		this.emailReceive = emailReceive;
	}

	public int getSponsorAmountAll() {
		return sponsorAmountAll;
	}

	public void setSponsorAmountAll(int sponsorAmountAll) {
		this.sponsorAmountAll = sponsorAmountAll;
	}
	
	

	
	
	
	
	
}