package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.command.SponsorCommand;
import com.ma2rix.music.model.domain.Sponsor;

public interface SponsorDao {
	public Sponsor getSponBySponsorNo(int sponsorNo);
	public int getSponByMemberNo(int memberNo);

	public void insertSponsor(Sponsor sponsor);
	public void deleteSponsor(Sponsor sponsor);
	public void updateSponsor(Sponsor sponsor);
	
	public int getSponListCount(int memberNo);
	public ArrayList<SponsorCommand> getSponList(int memberNo, int pageCount, int pageOffset);	
	
	public int getSponSumByMemberNo(int memberNo);
	
	public String getSponLastDay(int memberNo);
	
	public int getSponAlreadyCheck(int memberNo, int sponsorNo);
	
}
