package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.WorkspaceDao;
import com.ma2rix.music.model.domain.Arrangement;
import com.ma2rix.music.model.domain.Code;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.model.domain.SongWriting;
import com.ma2rix.music.model.domain.Vocal;
import com.ma2rix.music.model.domain.Workspace;
import com.ma2rix.music.service.interfaces.WorkspaceService;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {

	@Autowired
	WorkspaceDao workspaceDao;

	@Override
	public ArrayList<Workspace> getProjectsByComposeMemberNoAndComposeStatus(
			int memberNo, String composeStatus1, String composeStatus2
			) {
		return workspaceDao.getProjectsByComposeMemberNoAndComposeStatus(
				memberNo, composeStatus1, composeStatus2);
	}

	@Override
	public ArrayList<Arrangement> getProjectsByArrangeMemberNoAndArrangeMemberStatus(
			int memberNo, String arrangeStatus1, String arrangeStatus2) {
		return workspaceDao.getProjectsByArrangeMemberNoAndArrangeMemberStatus(
				memberNo, arrangeStatus1, arrangeStatus2);
	}

	@Override
	public ArrayList<Performance> getProjectsByperformMemberNoperformStatus(
			int memberNo, String performStatus1, String performStatus2) {
		return workspaceDao.getProjectsByperformMemberNoperformStatus(memberNo,
				performStatus1, performStatus2);
	}

	@Override
	public ArrayList<Vocal> getProjectsByVocalMemberNoVocalStatus(int memberNo,
				String vocalStatus1, String vocalStatus2, String vocalStatus3){
		return workspaceDao.getProjectsByVocalMemberNoVocalStatus(memberNo,
				vocalStatus1, vocalStatus2, vocalStatus3);
	}

	@Override
	public ArrayList<SongWriting> getProjectsByWriteMemberNoWriteStatus(
			int memberNo, String writeStatus) {
		return workspaceDao.getProjectsByWriteMemberNoWriteStatus(memberNo,
				writeStatus);
	}

	@Override
	public Code getMyPart(int memberNo) {
		return workspaceDao.getMyPart(memberNo);
	}

	@Override
	public int getFanCount(int memberNo) {
		return workspaceDao.getFanCount(memberNo);
	}

	@Override
	public int getSponsorAmount(int memberNo) {
		return workspaceDao.getSponsorAmount(memberNo);
	}

}
