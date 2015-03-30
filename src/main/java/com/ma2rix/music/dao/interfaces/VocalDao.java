package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.command.VocalCommand;

public interface VocalDao {
	
	public int getVocalCount(int genreNo, String isSearch, String searchWord);
	public int getVocalCountByVocalMemberNo(int vocalMemberNo);	
	public ArrayList<VocalCommand> getVocalCommandList(int genreNo, int pageCount, int pageOffset, String searchWord, String isSearch, int loginMemberNo);
	public ArrayList<VocalCommand> getAllVocalCommandList();
	public VocalCommand getVocalByvocalNo(int vocalNo, int loginMemberNo);		
	
}
