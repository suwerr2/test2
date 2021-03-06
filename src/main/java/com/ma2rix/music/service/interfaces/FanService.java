package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.command.FanCommand;
import com.ma2rix.music.model.command.FanManCommand;
import com.ma2rix.music.model.domain.Fan;

@Transactional
public interface FanService {

	public static final int PAGE_OFFSET = 20;
	
	public FanCommand getFancountByMusicNo(Fan fan);
	
	public void insertFan(Fan fan);
	
	public void deleteFan(Fan fan);
	
	public void updateCompositionFan(Fan fan);
	
	public void updateVocalFan(Fan fan);	
	
	public int getMyFanCount(int fanMemberNo);
	
	public int getFancountByMusicMemberNo(int musicMemberNo);
	
	public ArrayList<FanManCommand> getFanListAndMemberByMusicMemberNo(int fanMemberNo, int musicMemberNo, int pageCount);
	
	public int getFanListAndMemberCount(int fanMemberNo, int musicMemberNo);
	
	public ArrayList<FanManCommand> getFanAndMemberList(int fanMemberNo, int musicMemberNo, int pageCount, int pageOffset);	
	
}

