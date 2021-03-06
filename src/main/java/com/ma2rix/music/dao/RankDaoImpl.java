package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.RankDao;
import com.ma2rix.music.model.command.RankCommand;
import com.ma2rix.music.dao.mapper.RankMapper;

@Repository
public class RankDaoImpl implements RankDao {

	@Autowired private RankMapper rankMapper;

	@Override
	public int getRankCount(String rType, int genreNo, int isSelected, int isRecom, int isRecent) {
		return rankMapper.getRankCount(rType, genreNo, isSelected, isRecom, isRecent);
	}	
	
	@Override
	public ArrayList<RankCommand> getRankCommandList(String rType, int genreNo, int limitNum, int isSelected, int isRecom, int isRecent, int orderBy) {
		return rankMapper.getRankCommandList(rType, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
	}
	

	

}

