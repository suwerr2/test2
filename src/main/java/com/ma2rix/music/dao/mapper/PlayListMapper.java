package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.PlayListCommand;

public interface PlayListMapper {
	
	public int getPlayListCount(
				@Param("memberNo") int memberNo 
			);
	
	public ArrayList<PlayListCommand> getPlayList(
				@Param("memberNo") int memberNo, 			
				@Param("pageCount") int pageCount, 
				@Param("pageOffset") int pageOffset			
			);
	
	public void insertPlayList(
		@Param("musicClass") String musicClass,
		@Param("musicNo") int musicNo,
		@Param("memberNo") int memberNo		
	);
	
	public void deletePlayList(
			@Param("playListNo") int playListNo			
	);

}


