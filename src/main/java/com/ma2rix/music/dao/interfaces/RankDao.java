package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.command.RankCommand;

public interface RankDao {
	
	public int getRankCount(String rType, int genreNo, int isSelected, int isRecom, int isRecent);

	public ArrayList<RankCommand> getRankCommandList (String rtype, int genreNo, int limitNum, int isSelected, int isRecom, int isRecent, int orderBy);

}


