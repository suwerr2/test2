package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.PerformPlayerDao;
import com.ma2rix.music.dao.mapper.PerformPlayerMapper;
import com.ma2rix.music.model.command.PerformPlayerCommand;
import com.ma2rix.music.model.domain.PerformPlayer;

@Repository
public class PerformPlayerDaoImpl implements PerformPlayerDao {

	@Autowired PerformPlayerMapper pfMapper;
	
	@Override
	public int getPerformPlayerCount() {
		return pfMapper.getPerformPlayerCount();
	}

	@Override
	public ArrayList<PerformPlayer> getPerformPlayersByPlayerMemberNo(
			int playerMemberNo) {
		return pfMapper.getPerformPlayersByPlayerMemberNo(playerMemberNo);
	}

	@Override
	public ArrayList<PerformPlayer> getPerformPlayersByPerformNo(int performNo) {
		return pfMapper.getPerformPlayersByPerformNo(performNo);
	}

	@Override
	public PerformPlayer getPerformPlayerByPerformNoAndPlayerMemberNo(
			int performNo, int playerMemberNo) {
		return pfMapper.getPerformPlayersByPerformNoAndPlayerMemberNo(performNo, playerMemberNo);
	}

	@Override
	public void insertPerformPlayer(PerformPlayer performPlayer) {
		pfMapper.insertPerformPlayer(performPlayer);
	}

	@Override
	public void updatePerformPlayer(PerformPlayer performPlayer) {
		pfMapper.updatePerformPlayer(performPlayer);
	}

	@Override
	public void updatePerformPlayerCommand(PerformPlayerCommand performPlayerCommand) {
		pfMapper.updatePerformPlayerCommand(performPlayerCommand);
	}

	@Override
	public void deletePerformPlayer(int performNo, int playerMemberNo) {
		pfMapper.deletePerformPlayer(performNo, playerMemberNo);
	}
	
	@Override
	public ArrayList<PerformPlayerCommand> getPerformPlayersList(int arrangeNo, String search, String searchWord){
		return pfMapper.getPerformPlayersList(arrangeNo, search, searchWord);		
	}
	
	@Override
	public ArrayList<PerformPlayerCommand> getPerformPlayersAllList(String search, String searchWord){
		return pfMapper.getPerformPlayersAllList(search, searchWord);		
	}		
	
}
