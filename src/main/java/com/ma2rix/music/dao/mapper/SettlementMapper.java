package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.domain.Settlement;
import com.ma2rix.music.model.domain.SettlementDetail;

public interface SettlementMapper {
	public int getSettlementCount();
	public ArrayList<Settlement> getAllSettlementList();
	public ArrayList<SettlementDetail> getSettlementByMemberNo(
			@Param("pageCount") int pageCount, 
			@Param("pageOffset") int pageOffset, 
			@Param("searchMemberNo") int searchMemberNo, 
			@Param("dateFrom") String dateFrom, 
			@Param("dateTo") String dateTo, 
			@Param("musicField") String[] musicField);
	public void insertSettlement(Settlement settlement);
	public void updateSettlement(Settlement settlement);
	public void deleteSettlement(int settleNo);
	
}
