package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.SettlementDao;
import com.ma2rix.music.model.domain.Settlement;
import com.ma2rix.music.model.domain.SettlementDetail;
import com.ma2rix.music.service.interfaces.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {

	@Autowired SettlementDao settlementDao;
	
	@Override
	public int getSettlementCount() {
		return settlementDao.getSettlementCount();
	}

	@Override
	public ArrayList<Settlement> getAllSettlementList() {
		return settlementDao.getAllSettlementList();
	}
	@Override
	public ArrayList<SettlementDetail> getSettlementByMemberNo(int pageCount, int pageOffset, int searchMemberNo, String dateFrom, String dateTo, String[] musicField) {
		return settlementDao.getSettlementByMemberNo(pageCount, pageOffset, searchMemberNo, dateFrom, dateTo, musicField);
	}

	@Override
	public void insertSettlement(Settlement log) {
		settlementDao.insertSettlement(log);
	}

}