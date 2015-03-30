package com.ma2rix.music.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.PerformanceDao;
import com.ma2rix.music.dao.mapper.PerformanceMapper;
import com.ma2rix.music.model.domain.Performance;

@Repository
public class PerformanceDaoImpl implements PerformanceDao{

	@Autowired PerformanceMapper performanceMapper;
	
	@Override
	public int getPerformanceCountByPerformMemberNo(int performMemberNo){
 		return performanceMapper.getPerformanceCountByPerformMemberNo(performMemberNo);
 	}; 	
	
 	@Override
	public Performance getPerformanceByPerformMemberNo(int performMemberNo){
		return performanceMapper.getPerformanceByPerformMemberNo(performMemberNo);
	}

	@Override
 	public int getPerformanceMaxPerformNo(){
 		return performanceMapper.getPerformanceMaxPerformNo();
 	}; 	
}

