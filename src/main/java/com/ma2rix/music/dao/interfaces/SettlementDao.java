package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.domain.Settlement;
import com.ma2rix.music.model.domain.SettlementDetail;

public interface SettlementDao {
	
	public int getSettlementCount();
	public ArrayList<Settlement> getAllSettlementList();
	public ArrayList<SettlementDetail> getSettlementByMemberNo(int pageCount, int pageOffset, int searchMemberNo, String dateFrom, String dateTo, String[] musicField);
	public void insertSettlement(Settlement settlement);
	public void updateSettlement(Settlement settlement);
	public void deleteSettlement(int settleNo);
}
