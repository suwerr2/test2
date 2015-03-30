package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.command.ComposeArrangeCommand;
import com.ma2rix.music.model.command.CompositionCommand;
import com.ma2rix.music.model.domain.Composition;

public interface CompositionDao {
	public int getCompositionCount(String isSearch, String searchWord);
	public int getCompositionCountByComposeMemberNo(int composeMemberNo);
	public ArrayList<Composition> getCompositionList(int pageCount, int pageOffset, int orderBy);
	public ArrayList<CompositionCommand> getCompositionCommandList(int pageCount, int pageOffset, int orderBy, String searchWord, String isSearch, int loginMemberNo);
	
	public CompositionCommand getCompositionCommandByComposeNo(int composeNo, int loginMemberNo);
	public Composition getCompositionByComposeNo(int composeNo);
	public void updateCompositionFanCount(int composeNo);	
	public void insertComposition(Composition composition);
	public void updateComposition(Composition composition);
	public void deleteComposition(int composeNo);
	public ArrayList<ComposeArrangeCommand> getComposeArrangeCommandsByComposeNo(int composeNo);
}
