package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.WorkspaceDao;
import com.ma2rix.music.dao.mapper.WorkspaceMapper;
import com.ma2rix.music.model.domain.Arrangement;
import com.ma2rix.music.model.domain.Code;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.model.domain.SongWriting;
import com.ma2rix.music.model.domain.Vocal;
import com.ma2rix.music.model.domain.Workspace;

@Repository
public class WorkspaceDaoImpl implements WorkspaceDao {

	@Autowired
	WorkspaceMapper workspaceMapper;

	@Override
	public ArrayList<Workspace> getProjectsByComposeMemberNoAndComposeStatus(
			int memberNo, String composeStatus1, String composeStatus2) {
		return workspaceMapper.getProjectsByComposeMemberNoAndComposeStatus(
				memberNo, composeStatus1, composeStatus2);
	}

	@Override
	public ArrayList<Arrangement> getProjectsByArrangeMemberNoAndArrangeMemberStatus(
			int memberNo, String arrangeStatus1, String arrangeStatus2) {
		return workspaceMapper.getProjectsByArrangeMemberNoAndArrangeMemberStatus(memberNo,
						arrangeStatus1, arrangeStatus2);
	}

	@Override
	public ArrayList<Performance> getProjectsByperformMemberNoperformStatus(
			int memberNo, String performStatus1, String performStatus2){
		return workspaceMapper.getProjectsByperformMemberNoperformStatus(
				memberNo, performStatus1, performStatus2);
	}

	@Override
	public ArrayList<Vocal> getProjectsByVocalMemberNoVocalStatus(int memberNo,
				String vocalStatus1, String vocalStatus2, String vocalStatus3){
		return workspaceMapper.getProjectsByVocalMemberNoVocalStatus(memberNo,
				vocalStatus1, vocalStatus2, vocalStatus3);
	}

	@Override
	public ArrayList<SongWriting> getProjectsByWriteMemberNoWriteStatus(
			int memberNo, String writeStatus) {
		return workspaceMapper.getProjectsByWriteMemberNoWriteStatus(memberNo,
				writeStatus);
	}

	@Override
	public Code getMyPart(int memberNo) {
		return workspaceMapper.getMyPart(memberNo);
	}

	@Override
	public int getFanCount(int memberNo) {
		return workspaceMapper.getFanCount(memberNo);
	}

	@Override
	public int getSponsorAmount(int memberNo) {
		return workspaceMapper.getSponsorAmount(memberNo);
	}

}
