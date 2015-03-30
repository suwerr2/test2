package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.command.PlayListCommand;

@Transactional
public interface PlayListService {	
	
	public static final int PAGE_OFFSET = 10;
	
	public int getPlayListCount(int memberNo);
	
	public ArrayList<PlayListCommand> getPlayList(int memberNo, int pageCount, int pageOffset);

	public void insertPlayList(String musicClass, int musicNo, int memberNo);
	
	public void deletePlayList(int playListNo);
	
}
