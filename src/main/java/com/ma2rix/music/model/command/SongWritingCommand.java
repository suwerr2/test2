package com.ma2rix.music.model.command;

import java.io.Serializable;

import org.joda.time.DateTime;

public class SongWritingCommand implements Serializable {


		private static final long serialVersionUID = 1L;
		private int writeNo;
		private int arrangeNo;
		private String writeTitle;
		private String writeIntent;
		private String writeWords;
		private String languageNo;
		private int vocalCount;
		private int fanCount;
		private int writeHits;
		private String writeStatus;
		private DateTime regDatetime;
		private int modAdminNo;
		private DateTime modDatetime;
		private int memberNo;
		private String memberUserid;
		private String memberName;
		private String memberNickName;
		private String memberImage;
		
				
		public String getRealArrangeImage(){
			if (memberImage != null && ! "".equals(memberImage) ){
				return this.memberImage;
			}else {
				return "../resources/images/profile/profile_photo.png";
			}
		}		
		
		
		public SongWritingCommand(){
			super();
		}
		
		
		public SongWritingCommand(int writeNo, int arrangeNo,
				String writeTitle, String writeIntent, String writeWords,
				String languageNo, int vocalCount, int fanCount, int writeHits,
				String writeStatus, DateTime regDatetime, int modAdminNo,
				DateTime modDatetime, int memberNo, String memberUserid,
				String memberName, String memberNickName, String memberImage) {
			super();
			this.writeNo = writeNo;
			this.arrangeNo = arrangeNo;
			this.writeTitle = writeTitle;
			this.writeIntent = writeIntent;
			this.writeWords = writeWords;
			this.languageNo = languageNo;
			this.vocalCount = vocalCount;
			this.fanCount = fanCount;
			this.writeHits = writeHits;
			this.writeStatus = writeStatus;
			this.regDatetime = regDatetime;
			this.modAdminNo = modAdminNo;
			this.modDatetime = modDatetime;
			this.memberNo = memberNo;
			this.memberUserid = memberUserid;
			this.memberName = memberName;
			this.memberNickName = memberNickName;
			this.memberImage = memberImage;
		}


		public int getWriteNo() {
			return writeNo;
		}


		public void setWriteNo(int writeNo) {
			this.writeNo = writeNo;
		}


		public int getArrangeNo() {
			return arrangeNo;
		}


		public void setArrangeNo(int arrangeNo) {
			this.arrangeNo = arrangeNo;
		}


		public String getWriteTitle() {
			return writeTitle;
		}


		public void setWriteTitle(String writeTitle) {
			this.writeTitle = writeTitle;
		}


		public String getWriteIntent() {
			return writeIntent;
		}


		public void setWriteIntent(String writeIntent) {
			this.writeIntent = writeIntent;
		}


		public String getWriteWords() {
			return writeWords;
		}


		public void setWriteWords(String writeWords) {
			this.writeWords = writeWords;
		}


		public String getLanguageNo() {
			return languageNo;
		}


		public void setLanguageNo(String languageNo) {
			this.languageNo = languageNo;
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


		public int getWriteHits() {
			return writeHits;
		}


		public void setWriteHits(int writeHits) {
			this.writeHits = writeHits;
		}


		public String getWriteStatus() {
			return writeStatus;
		}


		public void setWriteStatus(String writeStatus) {
			this.writeStatus = writeStatus;
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


		public int getMemberNo() {
			return memberNo;
		}


		public void setMemberNo(int memberNo) {
			this.memberNo = memberNo;
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


		public String getMemberImage() {
			return memberImage;
		}


		public void setMemberImage(String memberImage) {
			this.memberImage = memberImage;
		}
		
		
		
		
		

}
