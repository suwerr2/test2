package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.MemberFieldDao;
import com.ma2rix.music.dao.mapper.MemberFieldMapper;
import com.ma2rix.music.model.command.MemberCommand;
import com.ma2rix.music.model.command.PerformanceCommand;
import com.ma2rix.music.model.domain.MemberField;
import com.ma2rix.music.model.domain.User;

@Repository
public class MemberFieldDaoImpl implements MemberFieldDao {

	@Autowired
	MemberFieldMapper memberFieldMapper;


	@Override
	public void insertMemberField(MemberField memberField) {
		memberFieldMapper.insertMemberField(memberField);
	}

	@Override
	public void deleteMemberField(MemberField memberField) {
		memberFieldMapper.deleteMemberField(memberField);
	}

	@Override
	public void updateMemberField(MemberField memberField) {
		memberFieldMapper.updateMemberField(memberField);
	}

	@Override
	public ArrayList<MemberField> getMemberFieldsByUser(User user) {
		return memberFieldMapper.getMemberFieldsByUser(user);
	}

	@Override
	public ArrayList<MemberField> getMemberFieldsByMemberNo(int memberNo) {
		return memberFieldMapper.getMemberFieldsByMemberNo(memberNo);
	}

	@Override
	public void deleteAllMemberFieldsByMemberNo(int memberNo) {
		memberFieldMapper.deleteAllMemberFieldsByMemberNo(memberNo);
	}

	@Override
	public ArrayList<MemberCommand> getMusicianSelectList(User user) {
		return memberFieldMapper.getMusicianSelectList(user);
	}

	@Override
	public ArrayList<MemberCommand> getMusicianArrangementSelectList(User user) {
		return memberFieldMapper.getMusicianArrangementSelectList(user);
	}
	
	@Override
	public ArrayList<MemberCommand> getMusicianArrangementParticipationSelectList(int arrangeNo){
		return memberFieldMapper.getMusicianArrangementParticipationSelectList(arrangeNo);
	}

	@Override
	public ArrayList<MemberCommand> getMusicianArrangementVocalSelectList(User user) {
		return memberFieldMapper.getMusicianArrangementVocalSelectList(user);
	}
	
	@Override
	public ArrayList<PerformanceCommand> getMusicianArrangementPerformanceSelectList(int arrangeNo){
		return memberFieldMapper.getMusicianArrangementPerformanceSelectList(arrangeNo);
	}
}

