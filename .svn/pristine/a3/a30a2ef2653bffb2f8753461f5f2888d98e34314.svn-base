package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.domain.Arrangement;
import com.ma2rix.music.model.domain.Code;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.model.domain.SongWriting;
import com.ma2rix.music.model.domain.Vocal;
import com.ma2rix.music.model.domain.Workspace;

public interface WorkspaceMapper {

	public ArrayList<Workspace> getProjectsByComposeMemberNoAndComposeStatus(
			@Param("memberNo") int memberNo, @Param("composeStatus1") String composeStatus1, @Param("composeStatus2") String composeStatus2);

	public ArrayList<Arrangement> getProjectsByArrangeMemberNoAndArrangeMemberStatus(
			@Param("memberNo") int memberNo, @Param("arrangeStatus1") String arrangeStatus1, @Param("arrangeStatus2") String arrangeStatus2);
	
	public ArrayList<Performance> getProjectsByperformMemberNoperformStatus(
			@Param("memberNo") int memberNo, @Param("performStatus1") String performStatus1, @Param("performStatus2") String performStatus2);
	
	public ArrayList<Vocal> getProjectsByVocalMemberNoVocalStatus(
			@Param("memberNo") int memberNo, @Param("vocalStatus1") String vocalStatus1, @Param("vocalStatus2") String vocalStatus2, @Param("vocalStatus3") String vocalStatus3);
	
	public ArrayList<SongWriting> getProjectsByWriteMemberNoWriteStatus(
			@Param("memberNo") int memberNo, @Param("writeStatus") String writeStatus);

	public Code getMyPart(int memberNo);
	
	public int getFanCount(int memberNo);

	public int getSponsorAmount(int memberNo);
}
