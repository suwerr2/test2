package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.command.SponsorCommand;
import com.ma2rix.music.model.domain.Sponsor;

@Transactional
public interface SponsorService {
	
	public static final int PAGE_OFFSET = 40;	
	
	public Sponsor getSponBySponsorNo(int SponsorNo);
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
