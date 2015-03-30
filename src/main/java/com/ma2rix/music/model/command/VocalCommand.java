package com.ma2rix.music.model.command;

import java.io.Serializable;

import org.joda.time.DateTime;

/**
 * 편곡 리스트 및 편곡 세부 정보보기에 사용되는 command 클래스
 */
public class VocalCommand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int vocalNo;								/* 보컬번호 */
	private int arrangeNo;								/* 편곡번호 */
	private int writeNo;								/* 작사번호 */
	private int vocalMemberNo;							/* 보컬회원번호 */
	private String memberName;							/* 보컬명 */
	private String memberNickName;						/* 보컬닉네임 */
	private int vocalRate;								/* 보컬배분율 */
	private String vocalMemo;							/* 메모 */
	private int fanCount;								/* 팬수 */
	private int arrangeHits;							/* 조회수 */
	private int vocalImages;							/* 보컬이미지 */
	private String vocalImageWeb;						/* 편곡이미지파일 Web Path */
	private String vocalImageFile;						/* 편곡이미지파일 Local Path */  
	private int vocalSound;								/* 보컬사운드 */
	private String vocalSoundWeb;						/* 음원파일 Web Path */  
	private String vocalSoundFile;						/* 음원파일 Local Path */
	private String vocalSoundMp3;						/* 음원파일 mp3 Path */
	private String vocalSoundOgg;						/* 음원파일 ogg Path */
	private String vocalSoundPng;						/* 음원파일 pbg Path */
	private float salePrice;							/* 판매가격 */
	private String choiceStatus;						/* 선택여부 */
	private String confirmStatus;						/* 확정여부 */
	private String vocalStatus;							/* 보컬상태 */
	private DateTime regDatetime;						/* 등록일시 */
	private int modAdminNo;								/* 수정관리자 번호 */
	private DateTime modDatetime;						/* 수정일시 */
	private int sponsorAmount;							/* 지원받은 스폰서 금액 */
	private String genreName;								/* 장르명 */
	private String arrangeTitle;						/* 노래제목 */
	private int fanHeartCount;	
	
	public VocalCommand(){
		super();
	}
	

	public VocalCommand(int vocalNo, int arrangeNo, int writeNo,
			int vocalMemberNo, String memberName, String memberNickName,
			int vocalRate, String vocalMemo, int fanCount, int arrangeHits,
			int vocalImages, String vocalImageWeb, String vocalImageFile,
			int vocalSound, String vocalSoundWeb, String vocalSoundFile,
			String vocalSoundMp3, String vocalSoundOgg, String vocalSoundPng,
			float salePrice, String choiceStatus, String confirmStatus,
			String vocalStatus, DateTime regDatetime, int modAdminNo,
			DateTime modDatetime, int sponsorAmount, String genreName,
			String arrangeTitle, int fanHeartCount) {
		super();
		this.vocalNo = vocalNo;
		this.arrangeNo = arrangeNo;
		this.writeNo = writeNo;
		this.vocalMemberNo = vocalMemberNo;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.vocalRate = vocalRate;
		this.vocalMemo = vocalMemo;
		this.fanCount = fanCount;
		this.arrangeHits = arrangeHits;
		this.vocalImages = vocalImages;
		this.vocalImageWeb = vocalImageWeb;
		this.vocalImageFile = vocalImageFile;
		this.vocalSound = vocalSound;
		this.vocalSoundWeb = vocalSoundWeb;
		this.vocalSoundFile = vocalSoundFile;
		this.vocalSoundMp3 = vocalSoundMp3;
		this.vocalSoundOgg = vocalSoundOgg;
		this.vocalSoundPng = vocalSoundPng;
		this.salePrice = salePrice;
		this.choiceStatus = choiceStatus;
		this.confirmStatus = confirmStatus;
		this.vocalStatus = vocalStatus;
		this.regDatetime = regDatetime;
		this.modAdminNo = modAdminNo;
		this.modDatetime = modDatetime;
		this.sponsorAmount = sponsorAmount;
		this.genreName = genreName;
		this.arrangeTitle = arrangeTitle;
		this.fanHeartCount = fanHeartCount;		
	}
	public int getVocalNo() {
		return vocalNo;
	}
	public void setVocalNo(int vocalNo) {
		this.vocalNo = vocalNo;
	}
	public int getArrangeNo() {
		return arrangeNo;
	}
	public void setArrangeNo(int arrangeNo) {
		this.arrangeNo = arrangeNo;
	}
	public int getWriteNo() {
		return writeNo;
	}
	public void setWriteNo(int writeNo) {
		this.writeNo = writeNo;
	}
	public int getVocalMemberNo() {
		return vocalMemberNo;
	}
	public void setVocalMemberNo(int vocalMemberNo) {
		this.vocalMemberNo = vocalMemberNo;
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
	public int getVocalRate() {
		return vocalRate;
	}
	public void setVocalRate(int vocalRate) {
		this.vocalRate = vocalRate;
	}
	public String getVocalMemo() {
		return vocalMemo;
	}
	public void setVocalMemo(String vocalMemo) {
		this.vocalMemo = vocalMemo;
	}
	public int getFanCount() {
		return fanCount;
	}
	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}
	public int getArrangeHits() {
		return arrangeHits;
	}
	public void setArrangeHits(int arrangeHits) {
		this.arrangeHits = arrangeHits;
	}
	public int getVocalImages() {
		return vocalImages;
	}
	public void setVocalImages(int vocalImages) {
		this.vocalImages = vocalImages;
	}
	public String getVocalImageWeb() {
		return vocalImageWeb;
	}
	public void setVocalImageWeb(String vocalImageWeb) {
		this.vocalImageWeb = vocalImageWeb;
	}
	public String getVocalImageFile() {
		return vocalImageFile;
	}
	public void setVocalImageFile(String vocalImageFile) {
		this.vocalImageFile = vocalImageFile;
	}
	public int getVocalSound() {
		return vocalSound;
	}
	public void setVocalSound(int vocalSound) {
		this.vocalSound = vocalSound;
	}
	public String getVocalSoundWeb() {
		return vocalSoundWeb;
	}
	public void setVocalSoundWeb(String vocalSoundWeb) {
		this.vocalSoundWeb = vocalSoundWeb;
	}
	public String getVocalSoundFile() {
		return vocalSoundFile;
	}
	public void setVocalSoundFile(String vocalSoundFile) {
		this.vocalSoundFile = vocalSoundFile;
	}
	public String getVocalSoundMp3() {
		return vocalSoundMp3;
	}
	public void setVocalSoundMp3(String vocalSoundMp3) {
		this.vocalSoundMp3 = vocalSoundMp3;
	}
	public String getVocalSoundOgg() {
		return vocalSoundOgg;
	}
	public void setVocalSoundOgg(String vocalSoundOgg) {
		this.vocalSoundOgg = vocalSoundOgg;
	}
	public String getVocalSoundPng() {
		return vocalSoundPng;
	}
	public void setVocalSoundPng(String vocalSoundPng) {
		this.vocalSoundPng = vocalSoundPng;
	}
	public float getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}
	public String getChoiceStatus() {
		return choiceStatus;
	}
	public void setChoiceStatus(String choiceStatus) {
		this.choiceStatus = choiceStatus;
	}
	public String getConfirmStatus() {
		return confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}
	public String getVocalStatus() {
		return vocalStatus;
	}
	public void setVocalStatus(String vocalStatus) {
		this.vocalStatus = vocalStatus;
	}
	public DateTime getRegDatetime() {
		return regDatetime;
	}
	public void setRegDatetime(DateTime regDatetime) {
		this.regDatetime = regDatetime;
	}
	public int getModAdminNo() {
		return modAdminNo;
	}
	public void setModAdminNo(int modAdminNo) {
		this.modAdminNo = modAdminNo;
	}
	public DateTime getModDatetime() {
		return modDatetime;
	}
	public void setModDatetime(DateTime modDatetime) {
		this.modDatetime = modDatetime;
	}
	public int getSponsorAmount() {
		return sponsorAmount;
	}
	public void setSponsorAmount(int sponsorAmount) {
		this.sponsorAmount = sponsorAmount;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}


	public String getArrangeTitle() {
		return arrangeTitle;
	}


	public void setArrangeTitle(String arrangeTitle) {
		this.arrangeTitle = arrangeTitle;
	}


	public int getFanHeartCount() {
		return fanHeartCount;
	}


	public void setFanHeartCount(int fanHeartCount) {
		this.fanHeartCount = fanHeartCount;
	}	
		
	
	
	
	
}
