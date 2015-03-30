package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.SponsorDao;
import com.ma2rix.music.model.command.SponsorCommand;
import com.ma2rix.music.model.domain.Sponsor;
import com.ma2rix.music.service.interfaces.SponsorService;

@Service
public class SponsorServiceImpl implements SponsorService {

	@Autowired SponsorDao sposorDao; 
	
	@Override
	public Sponsor getSponBySponsorNo(int sponsorNo) {
		return sposorDao.getSponBySponsorNo(sponsorNo);
	}

	@Override
	public int getSponByMemberNo(int memberNo) {
		return sposorDao.getSponByMemberNo(memberNo);
	}

	@Override
	public void insertSponsor(Sponsor sponsor) {
		sposorDao.insertSponsor(sponsor);
	}

	@Override
	public void deleteSponsor(Sponsor sponsor) {
		sposorDao.deleteSponsor(sponsor);
	}

	@Override
	public void updateSponsor(Sponsor sponsor) {
		sposorDao.updateSponsor(sponsor);
	}
	
	@Override
	public int getSponListCount(int memberNo) {
		return sposorDao.getSponListCount(memberNo);
	}
	
	@Override
	public ArrayList<SponsorCommand> getSponList(int memberNo, int pageCount, int pageOffset){
		return sposorDao.getSponList(memberNo, pageCount, pageOffset);
	}
	
	@Override
	public int getSponSumByMemberNo(int memberNo){
		return sposorDao.getSponSumByMemberNo(memberNo);		
	}
	
	@Override
	public String getSponLastDay(int memberNo){
		return sposorDao.getSponLastDay(memberNo);		
	}	
	
	@Override
	public int getSponAlreadyCheck(int memberNo, int sponsorNo){
		return sposorDao.getSponAlreadyCheck(memberNo, sponsorNo);		
	}			

}
