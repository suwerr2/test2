package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.VocalCommand;

public interface VocalMapper {

	public int getVocalCount(
				@Param("genreNo") int genreNo, 				
				@Param("isSearch") String isSearch,		
				@Param("searchWord") String searchWord			
			);
	
	public int getVocalCountByVocalMemberNo(
			@Param("vocalMemberNo") int vocalMemberNo			
			);
	
	public ArrayList<VocalCommand> getVocalCommandList(
			@Param("genreNo") int genreNo, 			
			@Param("pageCount") int pageCount, 
			@Param("pageOffset") int pageOffset,
			@Param("searchWord") String searchWord,
			@Param("isSearch") String isSearch,
			@Param("loginMemberNo") int loginMemberNo			
			);
	
	public ArrayList<VocalCommand> getAllVocalCommandList();
	
	public VocalCommand getVocalByvocalNo(
			@Param("vocalNo") int vocalNo,
			@Param("loginMemberNo") int loginMemberNo
			);	
	
}
