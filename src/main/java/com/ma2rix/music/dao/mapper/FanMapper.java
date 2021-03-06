package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.FanCommand;
import com.ma2rix.music.model.command.FanManCommand;
import com.ma2rix.music.model.domain.Fan;

public interface FanMapper {

	public FanCommand getFancountByMusicNo(Fan fan);
	
	public int getMyFanCount (
			@Param("fanMemberNo") int fanMemberNo
	);
		
	public void insertFan (Fan fan);
	
	public void deleteFan (Fan fan);
	
	public void updateCompositionFan (Fan fan);
	
	public void updateVocalFan (Fan fan);	
	
	public int getFancountByMusicMemberNo(int musicMemberNo);
	
	public ArrayList<FanManCommand> getFanListAndMemberByMusicMemberNo(			
				@Param("fanMemberNo") int fanMemberNo,			
				@Param("musicMemberNo") int musicMemberNo,
				@Param("pageCount") int pageCount			
			);
	
	public int getFanListAndMemberCount(
				@Param("fanMemberNo") int fanMemberNo,						
				@Param("musicMemberNo") int musicMemberNo			
			);
	
	public ArrayList<FanManCommand> getFanAndMemberList(
				@Param("fanMemberNo") int fanMemberNo,			
				@Param("musicMemberNo") int musicMemberNo,
				@Param("pageCount") int pageCount,
				@Param("pageOffset") int pageOffset
			);
	
}
