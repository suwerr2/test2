package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.PerformPlayerCommand;
import com.ma2rix.music.model.domain.PerformPlayer;

public interface PerformPlayerDao {
	public int getPerformPlayerCount();
	public ArrayList<PerformPlayer> getPerformPlayersByPlayerMemberNo(int playerMemberNo);
	public ArrayList<PerformPlayer> getPerformPlayersByPerformNo(int performNo);
	public PerformPlayer getPerformPlayerByPerformNoAndPlayerMemberNo(
			@Param("performNo") int performNo,
			@Param("playerMemberNo") int playerMemberNo);
	public void insertPerformPlayer(PerformPlayer performPlayer);
	public void updatePerformPlayer(PerformPlayer performPlayer);
	public void updatePerformPlayerCommand(PerformPlayerCommand performPlayerCommand);
	public void deletePerformPlayer(
			@Param("performNo") int performNo,
			@Param("playerMemberNo") int playerMemberNo);
	public ArrayList<PerformPlayerCommand> getPerformPlayersList(int arrangeNo, String search, String searchWord);
	public ArrayList<PerformPlayerCommand> getPerformPlayersAllList(String search, String searchWord);
}
