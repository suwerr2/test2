package com.ma2rix.music.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include")
public class IncludeController extends ApplicationController{
	
	/**
	 * 요청에 대해서 Forwarding 하기 위한 내부 클래스 
	 *
	 */
	public static class IncludeForward {
		public static final String INCLUDE_TOP   	= "include/top";
		public static final String INCLUDE_BOTTOM	= "include/bottom";
	}
	
	@RequestMapping(value ="/top")
	public String includeTop(ModelMap model){
		return IncludeForward.INCLUDE_TOP;
	}

	@RequestMapping(value ="/bottom")
	public String includeBottom(ModelMap model){
		return IncludeForward.INCLUDE_BOTTOM;
	}
	
}

