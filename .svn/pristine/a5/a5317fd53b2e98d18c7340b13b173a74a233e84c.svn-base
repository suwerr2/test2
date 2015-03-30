package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.RankCommand;

public interface RankMapper {
	
	public int getRankCount(
		@Param("rType") String rType,
		@Param("genreNo") int genreNo,
		@Param("isSelected") int isSelected,
		@Param("isRecom") int isRecom,
		@Param("isRecent") int isRecent		
	);

	public ArrayList<RankCommand> getRankCommandList (
			@Param("rType") String rType,
			@Param("genreNo") int genreNo,
			@Param("limitNum") int limitNum,
			@Param("isSelected") int isSelected,
			@Param("isRecom") int isRecom,
			@Param("isRecent") int isRecent,
			@Param("orderBy") int orderBy
			);

}