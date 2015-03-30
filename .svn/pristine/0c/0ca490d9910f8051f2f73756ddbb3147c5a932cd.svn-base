package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.VocalDao;
import com.ma2rix.music.dao.mapper.VocalMapper;
import com.ma2rix.music.model.command.VocalCommand;

@Repository
public class VocalDaoImpl implements VocalDao {

	@Autowired private VocalMapper vocalMapper;	
	
	@Override
	public int getVocalCount(int genreNo, String isSearch, String searchWord){
		return vocalMapper.getVocalCount(genreNo, isSearch, searchWord);
	};
	
	@Override
	public int getVocalCountByVocalMemberNo(int vocalMemberNo){
		return vocalMapper.getVocalCountByVocalMemberNo(vocalMemberNo);
	};	

	@Override	
	public ArrayList<VocalCommand> getVocalCommandList(int genreNo, int pageCount, int pageOffset, String searchWord, String isSearch, int loginMemberNo){
		return vocalMapper.getVocalCommandList(genreNo, pageCount, pageOffset, searchWord, isSearch, loginMemberNo);			
	};
	
	@Override	
	public ArrayList<VocalCommand> getAllVocalCommandList(){
		return vocalMapper.getAllVocalCommandList();		
	};

	@Override	
	public VocalCommand getVocalByvocalNo(int vocalNo, int loginMemberNo){
		return vocalMapper.getVocalByvocalNo(vocalNo, loginMemberNo);				
	};	
	
}
