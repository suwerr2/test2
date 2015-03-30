package com.ma2rix.music.model.domain;

import java.io.Serializable;

import org.joda.time.DateTime;

public class Settlement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int settleNo;       //정산번호
	private String settleDate;       //정산일자
	private String settleTime;       //정산시간
	private int settleMemberNo;       //정산회원번호
	private int payNo;       //결제번호
	private float settleAmount;       //정산금액
	private float payFee;       //결제수수료
	private int regAdminNo;       //등록관리자번호
	private DateTime regDatetime;       //등록일시

	public Settlement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Settlement(int settleNo, 
			String settleDate, 
			String settleTime, 
			int settleMemberNo, 
			int payNo, 
			float settleAmount, 
			float payFee, 
			int regAdminNo, 
			DateTime regDatetime) {
		super();
		this.settleNo = settleNo;
		this.settleDate = settleDate;
		this.settleTime = settleTime;
		this.settleMemberNo = settleMemberNo;
		this.payNo = payNo;
		this.settleAmount = settleAmount;
		this.payFee = payFee;
		this.regAdminNo = regAdminNo;
		this.regDatetime = regDatetime;
	}
	public int getSettleNo() {
		return settleNo;
	}
	public void setSettleNo(int settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getSettleTime() {
		return settleTime;
	}
	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}
	public int getSettleMemberNo() {
		return settleMemberNo;
	}
	public void setSettleMemberNo(int settleMemberNo) {
		this.settleMemberNo = settleMemberNo;
	}
	public int getPayNo() {
		return payNo;
	}
	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}
	public float getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(float settleAmount) {
		this.settleAmount = settleAmount;
	}
	public float getPayFee() {
		return payFee;
	}
	public void setPayFee(float payFee) {
		this.payFee = payFee;
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
	
}
