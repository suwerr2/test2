package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.ComposeArrangeCommand;
import com.ma2rix.music.model.command.CompositionCommand;
import com.ma2rix.music.model.domain.Composition;

public interface CompositionMapper {
	public int getCompositionCount(
			@Param("isSearch") String isSearch,
			@Param("searchWord") String searchWord			
			);
	public int getCompositionCountByComposeMemberNo(
			@Param("composeMemberNo") int composeMemberNo			
			);
	
	public ArrayList<Composition> getCompositionList(
			@Param("pageCount") int pageCount,
			@Param("pageOffset") int pageOffset, 
			@Param("orderBy") int orderBy
			);
	
	public ArrayList<CompositionCommand> getCompositionCommandList(
			@Param("pageCount") int pageCount,
			@Param("pageOffset") int pageOffset,
			@Param("orderBy") int orderBy,
			@Param("searchWord") String searchWord,
			@Param("isSearch") String isSearch,
			@Param("loginMemberNo") int loginMemberNo			
			);
	
	public CompositionCommand getCompositionCommandByComposeNo(
			@Param("composeNo") int composeNo,
			@Param("loginMemberNo") int loginMemberNo
			);
	
	public Composition getCompositionByComposeNo(int composeNo);
	public void updateCompositionFanCount(int composeNo);
	public void insertComposition(Composition composition);
	public void updateComposition(Composition composition);
	public void deleteComposition(int composeNo);
	public ArrayList<ComposeArrangeCommand> getComposeArrangeCommandsByComposeNo(int composeNo);
}
