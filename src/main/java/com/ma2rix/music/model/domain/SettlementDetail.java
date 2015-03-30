package com.ma2rix.music.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class SettlementDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int 	settleDetailNo;     //정산상세번호
	private String 	settleDate;       	//정산년월
	private int 	memberNo;       	//회원번호
	private String 	musicClass;       	//음원분류
	private int 	musicNo;       		//음원번호
	private String 	musicTitle;       	//음원제목
	private float 	settleRate;       	//배분률
	private float 	settleAmount;       //판매가
	private float 	payCharge;       	//결제수수료
	private float 	fee;       			//사업수수료
	private int 	regAdminNo;       	//등록관리자번호
	private DateTime regDatetime;       //등록일시
	private int 	modAdminNo;       	//수정관리자번호
	private DateTime modDatetime;       //수정일시
	private int 	rownum;       		//일련번호
	private int settleCount;  			// 판매갯수
    private float yesSettleAmount;  	//정산금액
    private float notSettleAmount;  	//미정산금액
    private float totSettleAmount;  	//합계
    private String[]	musicField;       	//음원분류

	public SettlementDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SettlementDetail(int settleDetailNo, 
			String settleDate, 
			int memberNo, 
			String musicClass, 
			int musicNo, 
			String musicTitle, 
			float settleRate, 
			float settleAmount, 
			float payCharge, 
			float fee, 
			int regAdminNo, 
			DateTime regDatetime, 
			int modAdminNo, 
			DateTime modDatetime,
			int settleCount,
			int rownum,
			float yesSettleAmount,
			float notSettleAmount,
			float totSettleAmount,
			String[] musicField 
) {
		super();
		this.settleDetailNo = settleDetailNo;
		this.settleDate = settleDate;
		this.memberNo = memberNo;
		this.musicClass = musicClass;
		this.musicNo = musicNo;
		this.musicTitle = musicTitle;
		this.settleRate = settleRate;
		this.settleAmount = settleAmount;
		this.payCharge = payCharge;
		this.fee = fee;
		this.regAdminNo = regAdminNo;
		this.regDatetime = regDatetime;
		this.modAdminNo = modAdminNo;
		this.modDatetime = modDatetime;
		this.settleCount = settleCount;
		this.rownum = rownum;
		this.yesSettleAmount = yesSettleAmount;
		this.notSettleAmount = notSettleAmount;
		this.totSettleAmount = totSettleAmount;
		this.musicField = musicField;

	}
	public int getSettleDetailNo() {
		return settleDetailNo;
	}
	public void setSettleDetailNo(int settleDetailNo) {
		this.settleDetailNo = settleDetailNo;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
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
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public float getSettleRate() {
		return settleRate;
	}
	public void setSettleRate(float settleRate) {
		this.settleRate = settleRate;
	}
	public float getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(float settleAmount) {
		this.settleAmount = settleAmount;
	}
	public float getPayCharge() {
		return payCharge;
	}
	public void setPayCharge(float payCharge) {
		this.payCharge = payCharge;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public int getRegAdminNo() {
		return regAdminNo;
	}
	public void setRegAdminNo(int regAdminNo) {
		this.regAdminNo = regAdminNo;
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
	public int getSettleCount() {
		return settleCount;
	}
	public void setSettleCount(int settleCount) {
		this.settleCount = settleCount;
	}
	public float getYesSettleAmount() {
		return yesSettleAmount;
	}
	public void setYesSettleAmount(float yesSettleAmount) {
		this.yesSettleAmount = yesSettleAmount;
	}
	public float getNotSettleAmount() {
		return notSettleAmount;
	}
	public void setNotSettleAmount(float notSettleAmount) {
		this.notSettleAmount = notSettleAmount;
	}
	public float getTotSettleAmount() {
		return totSettleAmount;
	}
	public void setTotSettleAmount(float totSettleAmount) {
		this.totSettleAmount = totSettleAmount;
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public String[] getMusicField() {
		return musicField;
	}
	public void setMusicField(String[] musicField) {
		this.musicField = musicField;
	}

	
}
