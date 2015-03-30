package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.VocalDao;
import com.ma2rix.music.model.command.VocalCommand;
import com.ma2rix.music.service.interfaces.VocalService;


@Service
public class VocalServiceImpl implements VocalService {

	@Autowired private VocalDao vocalDao;
	
	@Override
	public int getVocalCount(int genreNo, String isSearch, String searchWord){
		return vocalDao.getVocalCount(genreNo, isSearch, searchWord);
	};
	
	@Override
	public int getVocalCountByVocalMemberNo(int vocalMemberNo){
		return vocalDao.getVocalCountByVocalMemberNo(vocalMemberNo);
	};	

	@Override	
	public ArrayList<VocalCommand> getVocalCommandList(int genreNo, int pageCount, int pageOffset, String searchWord, String isSearch, int loginMemberNo){
		return vocalDao.getVocalCommandList(genreNo, pageCount, pageOffset, searchWord, isSearch, loginMemberNo);			
	};
	
	@Override	
	public ArrayList<VocalCommand> getAllVocalCommandList(){
		return vocalDao.getAllVocalCommandList();		
	};

	@Override	
	public VocalCommand getVocalByvocalNo(int vocalNo, int loginMemberNo){
		return vocalDao.getVocalByvocalNo(vocalNo, loginMemberNo);				
	};	

	
}
