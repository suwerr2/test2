package com.ma2rix.music.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ma2rix.music.common.Pagination;
import com.ma2rix.music.model.domain.Log;
import com.ma2rix.music.model.dto.ajaxresponse.GenericResponse;
import com.ma2rix.music.service.interfaces.LogService;
import com.ma2rix.music.service.interfaces.SettlementService;

@Controller
@RequestMapping("/log")
public class LogController extends ApplicationController{
	
	/**
	 * 요청에 대해서 Forwarding 하기 위한 내부 클래스 
	 *
	 */
	public static class AdminForward {

		public static final String LOG_LIST	= "admin/logList";
		public static final String VIEW_MANAGE	= "admin/viewManage";
		
	}
	
	@Autowired private LogService logService;
	@Autowired private SettlementService settleService;

	/**
	 * 로그조회 리스트페이지
	 */
	@RequestMapping(value = "/logList", method = RequestMethod.GET)
	public String list(ModelMap model) {

		return AdminForward.LOG_LIST;
	} 
	
	/**
	 * 로그조회 ajax 요청 처리  
	 * 관리자 로그목록 반환.
	 * 
	 */
	@ResponseBody
	@RequestMapping(value ="/getLogListByMemberNo", method = RequestMethod.GET)
	public GenericResponse<Log> getLogByMemberNo(
			@RequestParam("searchMemberNo") int searchMemberNo,
			@RequestParam("dateFrom") String dateFrom,
			@RequestParam("dateTo") String dateTo,
			@RequestParam(value = "page"	, required = false, defaultValue = "1" ) int page,
			ModelMap model)
	{	
		GenericResponse<Log> gr = new GenericResponse<Log>();

		int logTotalRow = logService.getLogCount();
		Pagination pagination = new Pagination(logTotalRow,page,LogService.PAGE_OFFSET);
		
		ArrayList<Log> getLogList = logService.getLogByMemberNo(pagination.getStartRow(),LogService.PAGE_OFFSET, searchMemberNo, dateFrom, dateTo);
		gr.setResultCode(1);
		gr.setMessage("success");
		gr.setCurrentRowCount(getLogList.size());
		gr.setTotalPage(getLogList.size());
		gr.setCurrentPage(page);
		gr.setTotalRow(logTotalRow);
		gr.setObjects(getLogList);
		return gr;
	}


	/**
	 * 로그조회 리스트페이지
	 */
	@RequestMapping(value = "/viewManage", method = RequestMethod.GET)
	public String viewManage(ModelMap model) {

		return AdminForward.VIEW_MANAGE;
	} 	
	
}
