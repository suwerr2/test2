package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.PlayListCommand;

public interface PlayListDao {

	public int getPlayListCount(int memberNo);	
	public ArrayList<PlayListCommand> getPlayList(int memberNo, int pageCount, int pageOffset);
	
	public void insertPlayList(String musicClass, int musicNo, int memberNo);
	
	public void deletePlayList(int playListNo);
		
}