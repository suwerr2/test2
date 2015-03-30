package com.ma2rix.music.dao.interfaces;

import com.ma2rix.music.model.domain.Performance;

public interface PerformanceDao {
 	public int getPerformanceCountByPerformMemberNo(int performMemberNo); 	
 	public Performance getPerformanceByPerformMemberNo(int performMemberNo);
 	public int getPerformanceMaxPerformNo(); 	
 	
}
