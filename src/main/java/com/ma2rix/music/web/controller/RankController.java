/**
 * 개발일자:2014.11.03
 * 개발자:김기수
 * 컨트롤러 설명 : 차트 관련 콘트롤러
 * 
 * @author v
 *
 */

package com.ma2rix.music.web.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ma2rix.music.model.command.RankCommand;
import com.ma2rix.music.model.dto.ajaxresponse.GenericResponse;
import com.ma2rix.music.service.interfaces.ArrangementService;
import com.ma2rix.music.service.interfaces.GenreService;
import com.ma2rix.music.service.interfaces.RankService;


@Controller
@RequestMapping("/rank")
public class RankController extends ApplicationController{

	/**
	 * 요청에 대해서 Forwarding 하기 위한 내부 클래스 
	 *
	 */
	public static class RankForward {
		public static final String RANK_PAGE 				= "rank/rankPage"; 	
		public static final String AUDIO_POPUP_PAGE			= "popup/audioSet";
	}
	
	@Autowired private RankService rankService;
	@Autowired private GenreService genreService;
	@Autowired private ArrangementService arrangementService;
	
	/**
	 * 차트페이지
	 * @param arrangeNo
	 * @return
	 */
	@RequestMapping(value ="/rankPage", method = RequestMethod.GET)
	public String rankPage(Locale locale,
			ModelMap model){
		
		Logger logger = Logger.getLogger(RankController.class);

		
//		최신싱글 리스트 		
		String rtype = "M"; 
		int genreNo = 0; 
		int limitNum = 8;
		int isSelected = 1;
		int isRecom = 0;
		int isRecent = 1;
		int orderBy = 1;  //1.랭킹순, 2.편곡조회순 
		
		ArrayList<RankCommand> rankCommandListRecent = 
				rankService.getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		model.addAttribute("genreNo", genreNo);
		model.addAttribute("recentList", rankCommandListRecent);
		
//		추천 싱글  리스트 		
		rtype = "M"; 
		genreNo = 0; 
		limitNum = 8;
		isSelected = 1;
		isRecom = 1;
		isRecent = 0;
		orderBy = 1;  //1.랭킹순, 2.편곡조회순 
				
		ArrayList<RankCommand> rankCommandListRecom = rankService.getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		model.addAttribute("genreNo", genreNo);		
		model.addAttribute("recommList", rankCommandListRecom);
		
//		주별  리스트		
		rtype = "W"; 
		genreNo = 0; 
		limitNum = 50;
		isSelected = 1;
		isRecom = 0;
		isRecent = 0;		
		orderBy = 1;  //1.랭킹순, 2.편곡조회순
		
		ArrayList<RankCommand> rankCommandListWeek = rankService.getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		model.addAttribute("weekList", rankCommandListWeek);

//		월별 리스트		
		rtype = "M"; 
		genreNo = 0; 
		limitNum = 50;
		isSelected = 1;
		isRecom = 0;
		isRecent = 0;		
		orderBy = 1;  //1.랭킹순, 2.편곡조회순		
		
		ArrayList<RankCommand> rankCommandListMonth = rankService.getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		model.addAttribute("monthList", rankCommandListMonth);

//		플레이별 리스트
		rtype = "M"; 
		genreNo = 0; 
		limitNum = 50;
		isSelected = 1;
		isRecom = 0;
		isRecent = 0;
		orderBy = 2;  //1.랭킹순, 2.편곡조회순		
		
		ArrayList<RankCommand> rankCommandListPlay = rankService.getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		model.addAttribute("playList", rankCommandListPlay);		
		
		model.addAttribute("genreList", genreService.getAllGenres());				
		return RankForward.RANK_PAGE;
		
	}

	
	
	
	
	/**
	 * 최신 싱글 리스트에 대한 ajax 요청 처리  
	 */
	@ResponseBody
	@RequestMapping(value ="/rankListRecentRemoteList", method = RequestMethod.GET)
	public GenericResponse<RankCommand> rankListRecentRemoteList(
			@RequestParam(value = "genreNo", required = false, defaultValue = "0" ) int genreNo,
			@RequestParam(value = "listType", required = false, defaultValue = "0" ) String listType,
			ModelMap model)
	{		
		Logger logger = Logger.getLogger(RankController.class);
		
		
		
		String rtype="M";  //M월간 , W주간
		int limitNum = 8;		
		int isSelected = 1;
		int isRecom = 0;
		int isRecent = 0;		
		
		if(listType.equals("recent")){
			isRecom = 0;
			isRecent = 1;			
		}else if(listType.equals("recom")){			
			isRecom = 1;
			isRecent = 0;			
		}		
		int orderBy = 1;
		
		
		int arrangeTotalRow = rankService.getRankCount(rtype, genreNo, isSelected, isRecom, isRecent);
		GenericResponse<RankCommand> gr = new GenericResponse<RankCommand>();		
		
		ArrayList<RankCommand> rankCommandListRecent = rankService.
				getRankCommandList(rtype, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
		
		gr.setResultCode(1);
//		gr.setListType(listType);
		gr.setMessage("success");
		gr.setCurrentRowCount(rankCommandListRecent.size());
		gr.setTotalPage(rankCommandListRecent.size());
//		gr.setCurrentPage(page);
		gr.setTotalRow(arrangeTotalRow);
		gr.setObjects(rankCommandListRecent);
		return gr;
	}
	
	
	
	
	
	/**
	 * 뮤직플레이어 팝업창
	 * popAudio
	 */
	@RequestMapping(value ="/popAudio", method = RequestMethod.GET)
	public String popAudio(
			@RequestParam(value = "arrangeNo", required = false, defaultValue = "1" ) int arrangeNo,			
			ModelMap model){
				
		model.addAttribute("arrangeDetail", arrangementService.getArrangementCommandByArrangeNo(arrangeNo));		
		
		Logger logger = Logger.getLogger(RankController.class);			
		return RankForward.AUDIO_POPUP_PAGE;
		
	}
	
	
	
	
	


}
