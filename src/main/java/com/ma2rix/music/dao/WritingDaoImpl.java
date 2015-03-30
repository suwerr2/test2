package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.WritingDao;
import com.ma2rix.music.dao.mapper.SongWritingMapper;
import com.ma2rix.music.model.command.SongWritingCommand;
import com.ma2rix.music.model.domain.SongWriting;

@Repository
public class WritingDaoImpl implements WritingDao{
	
	@Autowired private SongWritingMapper songWritingMapper;

	@Override
	public int getWritingCount(){
		return songWritingMapper.getWritingCount();
	}
	
	@Override
	public ArrayList<SongWriting> getAllWritings(){
		return songWritingMapper.getAllWritings();		
	}
	
	@Override
	public SongWriting getWritingByWriteNo(int writeNo){
		return songWritingMapper.getWritingByWriteNo(writeNo);
	}
	
	@Override
	public SongWriting getWritingsByWriteMemberNo(int writeMemberNo){
		return songWritingMapper.getWritingsByWriteMemberNo(writeMemberNo);
	}
	
	@Override
	public void insertWriting(SongWriting songWriting){
		songWritingMapper.insertWriting(songWriting);		
	}
	
	@Override
	public void updateWriting(SongWriting songWriting){
		songWritingMapper.updateWriting(songWriting);		
	}

	@Override
	public void deleteWriting(int writeNo){
		songWritingMapper.deleteWriting(writeNo);
	}

	@Override
	public void delelteWritingsByWriteMemberNo(int writeMemberNo){
		songWritingMapper.delelteWritingsByWriteMemberNo(writeMemberNo);		
	}
	
	@Override
	public ArrayList<SongWritingCommand> getWritingCommandByWriteNo(int arrangeNo){
		return songWritingMapper.getWritingCommandByWriteNo(arrangeNo);
	}

	
}
