package com.ma2rix.music.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@RequestMapping("/locale")
public class LocaleController {


	 @RequestMapping(value = "/setChangeLocale")
	public String changeLocale(@RequestParam(required = false) String lang,
	    ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">>>>>>>>lang:::::::"+lang);
		System.out.println("request.getHeader(Referer)::"+request.getHeader("Referer"));
		System.out.println("request.getRequestURI()::"+request.getRequestURI());
	  HttpSession session = request.getSession();
	    Locale locales = null;
	  // 넘어온 파라미터에 ko가 있으면 Locale의 언어를 한국어로 바꿔준다.
	  // 그렇지 않을 경우 영어로 설정한다.
	  if (lang == null){  
		  locales = Locale.KOREAN;  
	  }else if (lang.matches("en")) {
		  locales = Locale.ENGLISH;
	  } else {
	   locales = Locale.KOREAN;
	  }
	  
	  // 세션에 존재하는 Locale을 새로운 언어로 변경해준다.
	  session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locales);
	  // 해당 컨트롤러에게 요청을 보낸 주소로 돌아간다.
	  String redirectURL = "redirect:" + request.getHeader("Referer");
	  //System.out.println(">>changeLocale.redirectURL::"+redirectURL);
	  return redirectURL;
	  
	 }	
}
