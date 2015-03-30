package com.ma2rix.music.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.ma2rix.music.manager.AppConstants;
import com.ma2rix.music.model.domain.Arrangement;
import com.ma2rix.music.model.domain.Code;
import com.ma2rix.music.model.domain.Performance;
import com.ma2rix.music.model.domain.SongWriting;
import com.ma2rix.music.model.domain.Vocal;
import com.ma2rix.music.model.domain.Workspace;
import com.ma2rix.music.model.dto.MemberMessageType;
import com.ma2rix.music.service.interfaces.WorkspaceService;
import com.ma2rix.music.web.security.LoginInfo;

@Controller
@SessionAttributes({"workspaceUpdateCommand"})
@RequestMapping("/workspace")
public class WorkspaceController extends ApplicationController{
	
	/**
	 * 요청에 대해서 Forwarding 하기 위한 내부 클래스 
	 *
	 */
	public static class WorkspaceForward {
		public static final String WORKSPACE_LIST 				        = "workspace/workspaceAllView"; 
		public static final String LOGIN_FORM_VIEW 						= "user/login";
	}
	
	/**
	 * 재지정(304) redirect하기 위한 내부 클래스 
	 *
	 */
	public static class ArrangeRedirect{
		public static final String LOGIN 									= "redirect:/user/login";
	}
	
	public static class pageType{
		public static final String ARRANGE_INDEX 						= "redirect:/arrange/index";		
	}
	
	
	public static ArrayList<MemberMessageType> memberMessageTypes;
	
	static {
		memberMessageTypes= new ArrayList<MemberMessageType>();
		memberMessageTypes.add(new MemberMessageType("01", "편곡 참여 요청"));
		memberMessageTypes.add(new MemberMessageType("02", "연주 참여 요청"));
		memberMessageTypes.add(new MemberMessageType("03", "보컬 참여 요청"));
		memberMessageTypes.add(new MemberMessageType("04", "일반 메세지"));
	}
	
	@Autowired private WorkspaceService workspaceService;
	
	/**
	 * Workspace 리스트에 대한 요청 처리  
	 * 
	 */
	@RequestMapping(value ="/workspaceList", method = RequestMethod.GET)
	public String arrangeRemoteList(
			@RequestParam("listType") int listType, 
			ModelMap model) {
	
		LoginInfo loginInfo = loginInfoProvider.get();
        int memberNo;

        // TODO 로그인 안했을시 로그인 페이지로 이동. 이 부분은 나중에 로그인 정책 정해지면 삭제 
		try {
			memberNo = loginInfo.getCurrentUser().getMemberNo();  
		} catch (NullPointerException e) {
		     return  ArrangeRedirect.LOGIN;
		}
		
		String memberImage = loginInfo.getCurrentUser().getMemberImage();
		
		int fanCount = workspaceService.getFanCount(memberNo);
        int sponsorAmount = workspaceService.getSponsorAmount(memberNo);
        // TODO INCOME 부분 지불이나 정산 테이블 업무 정의 돼면 추가 
        Code myPart = workspaceService.getMyPart(memberNo);
        

        String composeStatus1 = AppConstants.ComposeStatus.COMPOSER_ROOM_PURCHASE;    //  작곡상태 : 01 작곡방구매
        String composeStatus2 = AppConstants.ComposeStatus.COMPOSING;    //  작곡상태 : 02 작곡중 
		
		ArrayList<Workspace> ongoingComposeProjects = workspaceService.getProjectsByComposeMemberNoAndComposeStatus(
				memberNo, composeStatus1, composeStatus2);
		int ongoingComposeProjectsCount = ongoingComposeProjects.size();
		
        composeStatus1 = AppConstants.ComposeStatus.COMPOSE_COMPLETED;    //  작곡상태 : 03 작곡완료 
        composeStatus2 = null;
		ArrayList<Workspace> completedComposedProjects = workspaceService.getProjectsByComposeMemberNoAndComposeStatus(
				memberNo, composeStatus1, composeStatus2);
		int completedComposeProjectsCount = completedComposedProjects.size();
		
        String arrangeStatus1 = AppConstants.ArrangeStatus.ARRANGING_ROOM_PURCHASE;    //  편곡상태 : 01 편곡방구매
        String arrangeStatus2 = AppConstants.ArrangeStatus.ARRANGING;    //  편곡상태 : 02 편곡중 
		ArrayList<Arrangement> ongoingArrangeProjects = workspaceService.getProjectsByArrangeMemberNoAndArrangeMemberStatus(
				memberNo, arrangeStatus1, arrangeStatus2);
		int ongoingArrangeProjectsCount = ongoingArrangeProjects.size();
		
		arrangeStatus1 = AppConstants.ArrangeStatus.ARRANGE_COMPLETED;    //  편곡상태 : 03 편곡완료
        arrangeStatus2 = null;
		ArrayList<Arrangement> completedArrangeProjects = workspaceService.getProjectsByArrangeMemberNoAndArrangeMemberStatus(
				memberNo, arrangeStatus1, arrangeStatus2);
		int completedArrangeProjectsCount = completedArrangeProjects.size();
		
		String performStatus1 = AppConstants.PerformStatus.PERFORM_WAITING;    //  연주상태 : 01  연주대기
		String performStatus2 = AppConstants.PerformStatus.PERFORM_COMPLETED	;  //  연주상태 : 02  연주확정
		ArrayList<Performance> ongoingPerformProjects = workspaceService.getProjectsByperformMemberNoperformStatus(
				memberNo, performStatus1, performStatus2);
		int ongoingPerformProjectsCount = ongoingPerformProjects.size();
		
		performStatus1 = AppConstants.PerformStatus.ARRANGE_COMPLETED;             //  연주상태 : 03 편곡완료
        performStatus2 = null;
		ArrayList<Performance> completedPerformProjects = workspaceService.getProjectsByperformMemberNoperformStatus(
				memberNo, performStatus1, performStatus2);
		int completedPerformProjectsCount = completedPerformProjects.size();
		
		String vocalStatus1 = AppConstants.VocalStatusEx.VOCAL_PURCHASE_REQUEST;     //  보컬상태 : 01  보컬구매요청
		String vocalStatus2 = AppConstants.VocalStatusEx.VOCAL_ROOM_PURCHASE;        //  보컬상태 : 02  보컬방구매
		String vocalStatus3 = AppConstants.VocalStatusEx.ING_VOCAL;                   //  보컬상태 : 03  보컬작업중
		ArrayList<Vocal> ongoingVocalProjects = workspaceService.getProjectsByVocalMemberNoVocalStatus(
				memberNo, vocalStatus1, vocalStatus2, vocalStatus3);
		int ongoingVocalProjectsCount = ongoingVocalProjects.size();
		
		vocalStatus1 = AppConstants.VocalStatusEx.VOCAL_COMPLETED;    //  보컬상태 : 04 보컬작업완료
		vocalStatus2 = null;
		vocalStatus3 = null;
		ArrayList<Vocal> completedVocalProjects = workspaceService.getProjectsByVocalMemberNoVocalStatus(
				memberNo, vocalStatus1, vocalStatus2, vocalStatus3);
		int completedVocalProjectsCount = completedVocalProjects.size();
		
		String writeStatus = AppConstants.LylicsStatus.LYLICS_REGISTER_COMPLETED;    //  작사상태 : 02 작사등록완료
		ArrayList<SongWriting> completedWriteProjects = workspaceService.getProjectsByWriteMemberNoWriteStatus(
				memberNo, writeStatus);
		int completedWriteProjectsCount = completedWriteProjects.size();

		model.addAttribute("memberImage", memberImage);
		model.addAttribute("fanCount", fanCount);
		model.addAttribute("sponsorAmount", sponsorAmount);
		model.addAttribute("myPart", myPart);

		model.addAttribute("ongoingComposeProjects", ongoingComposeProjects);
		model.addAttribute("ongoingComposeProjectsCount", ongoingComposeProjectsCount);
		model.addAttribute("completedComposedProjects", completedComposedProjects);
		model.addAttribute("completedprojectsCount", completedComposeProjectsCount);
		model.addAttribute("ongoingArrangeProjects", ongoingArrangeProjects);
		model.addAttribute("ongoingArrangeProjectsCount", ongoingArrangeProjectsCount );
		model.addAttribute("completedArrangeProjects", completedArrangeProjects);
		model.addAttribute("completedArrangeProjectsCount", completedArrangeProjectsCount);
		model.addAttribute("ongoingPerformProjects", ongoingPerformProjects);
		model.addAttribute("ongoingPerformProjectsCount", ongoingPerformProjectsCount);
		model.addAttribute("completedPerformProjects", completedPerformProjects);
		model.addAttribute("completedPerformProjectsCount", completedPerformProjectsCount);
		model.addAttribute("ongoingVocalProjects", ongoingVocalProjects);
		model.addAttribute("ongoingVocalProjectsCount", ongoingVocalProjectsCount);
		model.addAttribute("completedVocalProjects", completedVocalProjects);
		model.addAttribute("completedVocalProjectsCount", completedVocalProjectsCount);
		model.addAttribute("completedWriteProjects", completedWriteProjects);
		model.addAttribute("completedWriteProjectsCount", completedWriteProjectsCount);

		return  WorkspaceForward.WORKSPACE_LIST;
	}
	
}

