package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.LogDao;
import com.ma2rix.music.model.domain.Log;
import com.ma2rix.music.service.interfaces.LogService;

@Service
public class LogServiceImpl implements LogService {

	@Autowired LogDao logDao;
	
	@Override
	public int getLogCount() {
		return logDao.getLogCount();
	}

	@Override
	public ArrayList<Log> getAllLogList() {
		return logDao.getAllLogList();
	}
	@Override
	public ArrayList<Log> getLogByMemberNo(int pageCount, int pageOffset, int searchMemberNo, String dateFrom, String dateTo) {
		return logDao.getLogByMemberNo(pageCount, pageOffset, searchMemberNo, dateFrom, dateTo);
	}

	@Override
	public void insertLog(Log log) {
		logDao.insertLog(log);
	}


}
