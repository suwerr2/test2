package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.command.RankCommand;

@Transactional
public interface RankService {
	
	public int getRankCount(String rType, int genreNo, int isSelected, int isRecom, int isRecent);
	
	public ArrayList<RankCommand> getRankCommandList (String rType, int genreNo, 
			int limitNum, int isSelected, int isRecom, int isRecent, int orderBy);

}

