package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.domain.Settlement;
import com.ma2rix.music.model.domain.SettlementDetail;

@Transactional
public interface SettlementService {
	public int getSettlementCount();
	public ArrayList<Settlement> getAllSettlementList();
	public ArrayList<SettlementDetail> getSettlementByMemberNo(int pageCount, int pageOffset, int searchMemberNo, String dateFrom, String dateTo, String[] musicField);
	public void insertSettlement(Settlement log);
}
