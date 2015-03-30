package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.PlayListDao;
import com.ma2rix.music.model.command.PlayListCommand;
import com.ma2rix.music.service.interfaces.PlayListService;

@Service
public class PlayListServiceImpl implements PlayListService{
	
	@Autowired private PlayListDao playListDao;
	
	@Override
	public ArrayList<PlayListCommand> getPlayList(int memberNo, int pageCount, int pageOffset){
		return playListDao.getPlayList(memberNo, pageCount, pageOffset);		
	}

	@Override
	public int getPlayListCount(int memberNo) {
		return playListDao.getPlayListCount(memberNo);
	}
	
	@Override
	public void insertPlayList(String musicClass, int musicNo, int memberNo) {
		playListDao.insertPlayList(musicClass, musicNo, memberNo);
	}	
	
	@Override
	public void deletePlayList(int playListNo){
		playListDao.deletePlayList(playListNo);		
	}		
	
}
