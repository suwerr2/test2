package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.command.MemberCommand;
import com.ma2rix.music.model.command.PerformanceCommand;
import com.ma2rix.music.model.domain.MemberField;
import com.ma2rix.music.model.domain.User;

public interface MemberFieldMapper {
	public ArrayList<MemberField> getMemberFieldsByUser(User user);
	public ArrayList<MemberField> getMemberFieldsByMemberNo(int memberNo);
	public void insertMemberField(MemberField memberField);
	public void deleteMemberField(MemberField memberField);
	public void deleteAllMemberFieldsByMemberNo(int membeNo);
	public void updateMemberField(MemberField memberField);
	public ArrayList<MemberCommand> getMusicianSelectList(User user);
	public ArrayList<MemberCommand> getMusicianArrangementSelectList(User user);
	public ArrayList<MemberCommand> getMusicianArrangementParticipationSelectList(@Param("arrangeNo") int arrangeNo);
	public ArrayList<MemberCommand> getMusicianArrangementVocalSelectList(User user);
	public ArrayList<PerformanceCommand> getMusicianArrangementPerformanceSelectList(int arrangeNo);
}
