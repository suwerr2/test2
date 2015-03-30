package com.ma2rix.music.model.command;

import java.io.Serializable;
import java.util.ArrayList;

import com.ma2rix.music.model.domain.MemberField;
import com.ma2rix.music.model.domain.MemberLink;
import com.ma2rix.music.model.domain.MemberPlay;
import com.ma2rix.music.model.domain.User;

/**
 * @author v
 *
 */
public class ProfileCommand implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String profileWebPath;
	private User user;
	private ArrayList<MemberLink> memberLinks;  /* 회원 홈페이지 링크 */
	private ArrayList<MemberPlay> memberPlays;  /* 회원 연주분야 */
	private ArrayList<MemberField> memberFields; /* 회원 활동분야 */ 
	public ProfileCommand() {
		super();
	}
	public ProfileCommand(User user, ArrayList<MemberLink> memberLinks,
			ArrayList<MemberPlay> memberPlays,
			ArrayList<MemberField> memberFields) {
		super();
		this.user = user;
		this.memberLinks = memberLinks;
		this.memberPlays = memberPlays;
		this.memberFields = memberFields;
	}
	
	public String getProfileWebPath() {
		return profileWebPath;
	}
	public void setProfileWebPath(String profileWebPath) {
		this.profileWebPath = profileWebPath;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<MemberLink> getMemberLinks() {
		return memberLinks;
	}
	public void setMemberLinks(ArrayList<MemberLink> memberLinks) {
		this.memberLinks = memberLinks;
	}
	public ArrayList<MemberPlay> getMemberPlays() {
		return memberPlays;
	}
	public void setMemberPlays(ArrayList<MemberPlay> memberPlays) {
		this.memberPlays = memberPlays;
	}
	public ArrayList<MemberField> getMemberFields() {
		return memberFields;
	}
	public void setMemberFields(ArrayList<MemberField> memberFields) {
		this.memberFields = memberFields;
	}
	
	
}
