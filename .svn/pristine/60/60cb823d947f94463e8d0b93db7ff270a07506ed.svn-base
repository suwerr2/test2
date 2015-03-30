package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.SponsorDao;
import com.ma2rix.music.dao.mapper.SponsorMapper;
import com.ma2rix.music.model.command.SponsorCommand;
import com.ma2rix.music.model.domain.Sponsor;

@Repository
public class SponsorDaoImpl implements SponsorDao {

	@Autowired SponsorMapper sponsorMapper;
		
	@Override
	public Sponsor getSponBySponsorNo(int sponsorNo) {
		return sponsorMapper.getSponBySponsorNo(sponsorNo) ;
	}

	@Override
	public int getSponByMemberNo(int memberNo) {
		return sponsorMapper.getSponByMemberNo(memberNo);
	}

	@Override
	public void insertSponsor(Sponsor sponsor) {
		sponsorMapper.insertSponsor(sponsor);
	}


	@Override
	public void updateSponsor(Sponsor sponsor) {
		sponsorMapper.updateSponsor(sponsor);
	}

	@Override
	public void deleteSponsor(Sponsor sponsor) {
		sponsorMapper.deleteSponsor(sponsor);
	}
	
	@Override
	public int getSponListCount(int memberNo) {
		return sponsorMapper.getSponListCount(memberNo);
	}
	
	@Override
	public ArrayList<SponsorCommand> getSponList(int memberNo, int pageCount, int pageOffset){
		return sponsorMapper.getSponList(memberNo, pageCount, pageOffset);
	}	
	
	@Override
	public int getSponSumByMemberNo(int memberNo){
		return sponsorMapper.getSponSumByMemberNo(memberNo);		
	}
	
	@Override
	public String getSponLastDay(int memberNo){
		return sponsorMapper.getSponLastDay(memberNo);		
	}	
	
	@Override
	public int getSponAlreadyCheck(int memberNo, int sponsorNo){
		return sponsorMapper.getSponAlreadyCheck(memberNo, sponsorNo);		
	}		
	
	

}
