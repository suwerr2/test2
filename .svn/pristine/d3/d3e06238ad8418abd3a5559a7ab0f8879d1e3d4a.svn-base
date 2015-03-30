package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.domain.Log;

public interface LogMapper {
	public int getLogCount();
	public ArrayList<Log> getAllLogList();
	public ArrayList<Log> getLogByMemberNo(
			@Param("pageCount") int pageCount, 
			@Param("pageOffset") int pageOffset, 
			@Param("searchMemberNo") int searchMemberNo, 
			@Param("dateFrom") String dateFrom, 
			@Param("dateTo") String dateTo);
	public void insertLog(Log log);
	
}
