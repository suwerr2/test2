package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.domain.Log;

@Transactional
public interface LogService {
	
	public static final int PAGE_OFFSET = 10;
	
	public int getLogCount();
	public ArrayList<Log> getAllLogList();
	public ArrayList<Log> getLogByMemberNo(int pageCount, int pageOffset, int searchMemberNo, String dateFrom, String dateTo);
	public void insertLog(Log log);
}
