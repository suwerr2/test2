package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.command.FanCommand;
import com.ma2rix.music.model.command.FanManCommand;
import com.ma2rix.music.model.domain.Fan;

public interface FanDao {
	
	public FanCommand getFancountByMusicNo(Fan fan);
	
	public void insertFan(Fan fan);
	
	public void deleteFan(Fan fan);
	
	public int getMyFanCount(int fanMemberNo);

	public void updateCompositionFan (Fan fan);
	
	public void updateVocalFan (Fan fan);
	
	public int getFancountByMusicMemberNo(int musicMemberNo);
	
	public ArrayList<FanManCommand> getFanListAndMemberByMusicMemberNo(int fanMemberNo, int musicMemberNo, int pageCount);
	
	public int getFanListAndMemberCount(int fanMemberNo, int musicMemberNo);
	
	public ArrayList<FanManCommand> getFanAndMemberList(int fanMemberNo, int musicMemberNo, int pageCount, int pageOffset);
	
}


