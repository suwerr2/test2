package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.command.VocalCommand;

@Transactional
public interface VocalService {
	
	public static final int PAGE_OFFSET = 10;	
	
	public int getVocalCount(int genreNo, String isSearch, String searchWord);
	public int getVocalCountByVocalMemberNo(int vocalMemberNo);	
	public ArrayList<VocalCommand> getVocalCommandList(int genreNo, int pageCount, int pageOffset, String searchWord, String isSearch, int loginMemberNo);
	public ArrayList<VocalCommand> getAllVocalCommandList();
	public VocalCommand getVocalByvocalNo(int vocalNo, int loginMemberNo);

	
}
