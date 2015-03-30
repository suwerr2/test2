package com.ma2rix.music.model.domain;



public class Bulletin {
	
	public static final String MEMBER_FIELDS ="MA005";

	private int bulletinNo;
	private String bulletinClass;
	private String bulletinTitle;
	private String bulletinContent;
	private String bulletinStatus;
	private String contentType;
	private int bulletinHits;
	private int regAdminNo;
	private String regDatetime;
	private int modAdminNo;
		
	public Bulletin(){}

	public Bulletin(	int bulletinNo,
			String bulletinClass,
			String bulletinTitle,
			String bulletinContent,
			String bulletinStatus,
			String contentType,
			int bulletinHits,
			int regAdminNo,
			String regDatetime,
			int modAdminNo) {
		super();
		this.bulletinNo = bulletinNo;
		this.bulletinClass = bulletinClass;
		this.bulletinTitle = bulletinTitle;
		this.bulletinContent = bulletinContent;
		this.bulletinStatus = bulletinStatus;
		this.contentType = contentType;
		this.bulletinHits = bulletinHits;
		this.regAdminNo = regAdminNo;
		this.regDatetime = regDatetime;
		this.modAdminNo = modAdminNo;

	}

	public int getBulletinNo() {
		return bulletinNo;
	}

	public void setBulletinNo(int bulletinNo) {
		this.bulletinNo = bulletinNo;
	}

	public String getBulletinClass() {
		return bulletinClass;
	}

	public void setBulletinClass(String bulletinClass) {
		this.bulletinClass = bulletinClass;
	}

	public String getBulletinTitle() {
		return bulletinTitle;
	}

	public void setBulletinTitle(String bulletinTitle) {
		this.bulletinTitle = bulletinTitle;
	}

	public String getBulletinContent() {
		return bulletinContent;
	}

	public void setBulletinContent(String bulletinContent) {
		this.bulletinContent = bulletinContent;
	}

	public String getBulletinStatus() {
		return bulletinStatus;
	}

	public void setBulletinStatus(String bulletinStatus) {
		this.bulletinStatus = bulletinStatus;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getBulletinHits() {
		return bulletinHits;
	}

	public void setBulletinHits(int bulletinHits) {
		this.bulletinHits = bulletinHits;
	}

	public int getRegAdminNo() {
		return regAdminNo;
	}

	public void setRegAdminNo(int regAdminNo) {
		this.regAdminNo = regAdminNo;
	}

	public String getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(String regDatetime) {
		this.regDatetime = regDatetime;
	}

	public int getModAdminNo() {
		return modAdminNo;
	}

	public void setModAdminNo(int modAdminNo) {
		this.modAdminNo = modAdminNo;
	}

}
