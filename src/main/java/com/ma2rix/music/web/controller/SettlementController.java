package com.ma2rix.music.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ma2rix.music.common.Pagination;
import com.ma2rix.music.model.domain.Settlement;
import com.ma2rix.music.model.domain.SettlementDetail;
import com.ma2rix.music.model.dto.ajaxresponse.GenericResponse;
import com.ma2rix.music.service.interfaces.LogService;
import com.ma2rix.music.service.interfaces.SettlementService;
import com.ma2rix.music.web.security.LoginInfo;

@Controller
@RequestMapping("/settle")
public class SettlementController extends ApplicationController{
	
	/**
	 * 요청에 대해서 Forwarding 하기 위한 내부 클래스 
	 *
	 */
	public static class AdminForward {

		public static final String SETTLE_LIST	= "admin/settleList";
		public static final String MY_INCOME	= "workspace/myIncome";
		
	}
	
	@Autowired private SettlementService settleService;


	/**
	 * 정산조회 리스트페이지
	 */
	@RequestMapping(value = "/settlementList", method = RequestMethod.GET)
	public String settleList(ModelMap model) {

		return AdminForward.SETTLE_LIST;
	}	
	
	

	/**
	 * 정산조회 리스트페이지
	 */
	@RequestMapping(value = "/myIncome", method = RequestMethod.GET)
	public String mySettleList(ModelMap model) {

		return AdminForward.MY_INCOME;
	}	
	
	/**
	 * 정산조회 ajax 요청 처리  
	 * 관리자 정산조회 반환.
	 * 
	 */
	@ResponseBody
	@RequestMapping(value ="/getSettleListByMemberNo", method = RequestMethod.GET)
	public GenericResponse<SettlementDetail> getSettleByMemberNo(
			@RequestParam("searchMemberNo") int searchMemberNo,
			@RequestParam("dateFrom") String dateFrom,
			@RequestParam("dateTo") String dateTo,
			@RequestParam(value = "fieldParam" , required = false, defaultValue = "" ) String fieldParam,
			@RequestParam(value = "page"	, required = false, defaultValue = "1" ) int page,
			ModelMap model)
	{	
		GenericResponse<SettlementDetail> gr = new GenericResponse<SettlementDetail>();

		int logTotalRow = settleService.getSettlementCount();
		Pagination pagination = new Pagination(logTotalRow,page,LogService.PAGE_OFFSET);
		
		String[] musicParam = fieldParam.split(",");
	
		ArrayList<SettlementDetail> settleLogList = settleService.getSettlementByMemberNo(pagination.getStartRow(),LogService.PAGE_OFFSET, searchMemberNo, dateFrom, dateTo, musicParam);
		gr.setResultCode(1);
		gr.setMessage("success");
		gr.setCurrentRowCount(settleLogList.size());
		gr.setTotalPage(settleLogList.size());
		gr.setCurrentPage(page);
		gr.setTotalRow(logTotalRow);
		gr.setObjects(settleLogList);
		return gr;
	}
	
	/**
	 * 정산조회 ajax 요청 처리  
	 * 관리자 정산조회 반환.
	 * 
	 */
	@ResponseBody
	@RequestMapping(value ="/getMyIncome", method = RequestMethod.GET)
	public GenericResponse<SettlementDetail> getMyIncome(
			@RequestParam("dateFrom") String dateFrom,
			@RequestParam("dateTo") String dateTo,
			@RequestParam(value = "fieldParam" , required = false, defaultValue = "" ) String fieldParam,
			@RequestParam(value = "page"	, required = false, defaultValue = "1" ) int page,
			ModelMap model)
	{	
		
		System.out.println(">>getMyIncome");
		
		LoginInfo loginInfo = loginInfoProvider.get();
		    int searchMemberNo = 0;
		if ( loginInfo.getCurrentUser() != null){
			searchMemberNo = loginInfo.getCurrentUser().getMemberNo();
		}
		searchMemberNo = 1;
		
		String[] musicParam = fieldParam.split(",");
		GenericResponse<SettlementDetail> gr = new GenericResponse<SettlementDetail>();

		int logTotalRow = settleService.getSettlementCount();
		Pagination pagination = new Pagination(logTotalRow,page,LogService.PAGE_OFFSET);
		
		
		ArrayList<SettlementDetail> settleLogList = settleService.getSettlementByMemberNo(pagination.getStartRow(),LogService.PAGE_OFFSET, searchMemberNo, dateFrom, dateTo, musicParam);
		gr.setResultCode(1);
		gr.setMessage("success");
		gr.setCurrentRowCount(settleLogList.size());
		gr.setTotalPage(settleLogList.size());
		gr.setCurrentPage(page);
		gr.setTotalRow(logTotalRow);
		gr.setObjects(settleLogList);
		return gr;
	}
	
}
