package com.ma2rix.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.PerformanceDao;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.service.interfaces.PerformanceService;

@Service
public class PerformanceServiceImpl implements PerformanceService {

	@Autowired PerformanceDao performanceDao;
	
 	public int getPerformanceCountByPerformMemberNo(int performMemberNo){
 		return performanceDao.getPerformanceCountByPerformMemberNo(performMemberNo);
 	}; 	
 	public Performance getPerformanceByPerformMemberNo(int performMemberNo){
 		return performanceDao.getPerformanceByPerformMemberNo(performMemberNo);
 	};	
 	public int getPerformanceMaxPerformNo(){
 		return performanceDao.getPerformanceMaxPerformNo();
 	}; 	
	
}
