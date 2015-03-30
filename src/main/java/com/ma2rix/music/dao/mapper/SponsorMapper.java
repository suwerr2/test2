package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.joda.time.DateTime;

import com.ma2rix.music.model.command.SponsorCommand;
import com.ma2rix.music.model.domain.Sponsor;

public interface SponsorMapper {
	public Sponsor getSponBySponsorNo(int sponsorNo);
	public int getSponByMemberNo(int memberNo);

	public void insertSponsor(Sponsor sponsor);
	public void deleteSponsor(Sponsor sponsor);
	public void updateSponsor(Sponsor sponsor);
	
	public int getSponListCount(
			@Param("memberNo") int memberNo			
	);
	
	public ArrayList<SponsorCommand> getSponList(			
			@Param("memberNo") int memberNo,
			@Param("pageCount") int pageCount,
			@Param("pageOffset") int pageOffset			
	);	
	
	public int getSponSumByMemberNo(
			@Param("memberNo") int memberNo			
	);
	
	public String getSponLastDay(			
			@Param("memberNo") int memberNo			
	);
	
	public int getSponAlreadyCheck(
			@Param("memberNo") int memberNo,
			@Param("sponsorNo") int sponsorNo			
	);
	
	
}


