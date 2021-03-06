package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.domain.Arrangement;
import com.ma2rix.music.model.domain.Code;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.model.domain.SongWriting;
import com.ma2rix.music.model.domain.Vocal;
import com.ma2rix.music.model.domain.Workspace;

public interface WorkspaceDao {
	public ArrayList<Workspace> getProjectsByComposeMemberNoAndComposeStatus(
			int memberNo, String composeStatus1, String composeStatus2);
	
	public ArrayList<Arrangement> getProjectsByArrangeMemberNoAndArrangeMemberStatus(
			int memberNo, String arrangeStatus1, String arrangeStatus2);
	
	public ArrayList<Performance> getProjectsByperformMemberNoperformStatus(
			int memberNo, String performStatus1, String performStatus2);
	
	public ArrayList<Vocal> getProjectsByVocalMemberNoVocalStatus(int memberNo,
				String vocalStatus1, String vocalStatus2, String vocalStatus3);
	
	public ArrayList<SongWriting> getProjectsByWriteMemberNoWriteStatus(
			int memberNo, String writeStatus);

	public Code getMyPart(int memberNo);
	
	public int getFanCount(int memberNo);

	public int getSponsorAmount(int memberNo);
	
}
