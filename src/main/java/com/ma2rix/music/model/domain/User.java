package com.ma2rix.music.model.domain;



import java.io.Serializable;

import org.joda.time.DateTime;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int memberNo;
	private String memberUserId;
	private String memberName;
	private String memberPwd;
	private String memberPwdConfirm;
	private String memberRoute;
	private String memberNickName;
	private String memberImage;
	private String countryNo;
	private String memberCity;
	private String memberIntroduce;
	private String memberHomePage;
	private String homePageComment;
	private String memberStatus;
	private String emailReceive;
	private int communityMemberNo;
	private int sponsorAmout;
	private DateTime lastDateTime;
	private DateTime regDateTime;
	private int modAdminNo;
	private DateTime modDateTime;
	private String memberField;
	private String selectOpt;
	private String musicField;
	private int compositionCount;
	private int arrangementCount;
	private int performCount;
	private int vocalCount;
	private int fanCount;
	private String bankNo;
	private String accNo;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberUserId() {
		return memberUserId;
	}

	public void setMemberUserId(String memberUserId) {
		this.memberUserId = memberUserId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberPwdConfirm() {
		return memberPwdConfirm;
	}

	public void setMemberPwdConfirm(String memberPwdConfirm) {
		this.memberPwdConfirm = memberPwdConfirm;
	}

	public String getMemberRoute() {
		return memberRoute;
	}

	public void setMemberRoute(String memberRoute) {
		this.memberRoute = memberRoute;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}

	public String getMemberImage() {
		return memberImage;
	}

	public void setMemberImage(String memberImage) {
		this.memberImage = memberImage;
	}

	public String getCountryNo() {
		return countryNo;
	}

	public void setCountryNo(String countryNo) {
		this.countryNo = countryNo;
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

	public String getMemberHomePage() {
		return memberHomePage;
	}

	public void setMemberHomePage(String memberHomePage) {
		this.memberHomePage = memberHomePage;
	}

	public String getHomePageComment() {
		return homePageComment;
	}

	public void setHomePageComment(String homePageComment) {
		this.homePageComment = homePageComment;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getEmailReceive() {
		return emailReceive;
	}

	public void setEmailReceive(String emailReceive) {
		this.emailReceive = emailReceive;
	}

	public int getCommunityMemberNo() {
		return communityMemberNo;
	}

	public void setCommunityMemberNo(int communityMemberNo) {
		this.communityMemberNo = communityMemberNo;
	}

	public int getSponsorAmout() {
		return sponsorAmout;
	}

	public void setSponsorAmout(int sponsorAmout) {
		this.sponsorAmout = sponsorAmout;
	}

	public DateTime getLastDateTime() {
		return lastDateTime;
	}

	public void setLastDateTime(DateTime lastDateTime) {
		this.lastDateTime = lastDateTime;
	}

	public DateTime getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(DateTime regDateTime) {
		this.regDateTime = regDateTime;
	}

	public int getModAdminNo() {
		return modAdminNo;
	}

	public void setModAdminNo(int modAdminNo) {
		this.modAdminNo = modAdminNo;
	}

	public DateTime getModDateTime() {
		return modDateTime;
	}

	public void setModDateTime(DateTime modDateTime) {
		this.modDateTime = modDateTime;
	}

	public User(int memberNo, String memberUserId, String memberName,
			String memberPwd, String memberPwdConfirm, String memberRoute,
			String memberNickName, String memberImage, String countryNo,
			String memberCity, String memberIntroduce, String memberHomePage,
			String homePageComment, String memberStatus, String emailReceive,
			int communityMemberNo, int sponsorAmout, DateTime lastDateTime,
			DateTime regDateTime, int modAdminNo, DateTime modDateTime, String memberField, String selectOpt,
			String musicField,int compositionCount,int arrangementCount,int performCount,int vocalCount,int fanCount, String bankNo, String accNo) {
		super();
		this.memberNo = memberNo;
		this.memberUserId = memberUserId;
		this.memberName = memberName;
		this.memberPwd = memberPwd;
		this.memberPwdConfirm = memberPwdConfirm;
		this.memberRoute = memberRoute;
		this.memberNickName = memberNickName;
		this.memberImage = memberImage;
		this.countryNo = countryNo;
		this.memberCity = memberCity;
		this.memberIntroduce = memberIntroduce;
		this.memberHomePage = memberHomePage;
		this.homePageComment = homePageComment;
		this.memberStatus = memberStatus;
		this.emailReceive = emailReceive;
		this.communityMemberNo = communityMemberNo;
		this.sponsorAmout = sponsorAmout;
		this.lastDateTime = lastDateTime;
		this.regDateTime = regDateTime;
		this.modAdminNo = modAdminNo;
		this.modDateTime = modDateTime;
		this.memberField = memberField;
		this.selectOpt = selectOpt;
		this.musicField = musicField;
		this.compositionCount = compositionCount;
		this.arrangementCount = arrangementCount;
		this.performCount = performCount;
		this.vocalCount = vocalCount;
		this.fanCount = fanCount;
		this.bankNo = bankNo;
		this.accNo = accNo;
	}

	public void initLastLoginDateTime() {
		
		this.lastDateTime = new DateTime();
	}
	
	public void initModDateTime() {
		this.lastDateTime = new DateTime();
		
	}

	public String getMemberField() {
		return memberField;
	}

	public void setMemberField(String memberField) {
		this.memberField = memberField;
	}

	public String getSelectOpt() {
		return selectOpt;
	}

	public void setSelectOpt(String selectOpt) {
		this.selectOpt = selectOpt;
	}

	public String getMusicField() {
		return musicField;
	}

	public void setMusicField(String musicField) {
		this.musicField = musicField;
	}

	public int getCompositionCount() {
		return compositionCount;
	}

	public void setCompositionCount(int compositionCount) {
		this.compositionCount = compositionCount;
	}

	public int getArrangementCount() {
		return arrangementCount;
	}

	public void setArrangementCount(int arrangementCount) {
		this.arrangementCount = arrangementCount;
	}

	public int getPerformCount() {
		return performCount;
	}

	public void setPerformCount(int performCount) {
		this.performCount = performCount;
	}

	public int getVocalCount() {
		return vocalCount;
	}

	public void setVocalCount(int vocalCount) {
		this.vocalCount = vocalCount;
	}

	public int getFanCount() {
		return fanCount;
	}

	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
}
