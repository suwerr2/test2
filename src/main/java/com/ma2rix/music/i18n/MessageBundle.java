package com.ma2rix.music.i18n;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class MessageBundle implements MessageSourceAware{
	
	private static MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		MessageBundle.messageSource = messageSource;
	}
	
	public String getMessage(String code ){
		return null;
	}
	
    /**
     * 시스템 속성을 얻기위한 함수
     * 호출 내용은 기존 메시지와 동일하나 기능적으로 구분하기 위해서 추가한 메소드 이다. 
     */
    public static String prop(String key) {
    return MessageBundle.msg(key);
    }
    
    public static String prop(String key, Locale locale) {
    return MessageBundle.msg(key, locale);
    }
    
    public static String propFormat(String key, Object...objects) {
         return MessageFormat.format(MessageBundle.msg(key),objects);
    }
    
    public static String propFormat(String key, Locale locale, Object...objects) {
        return MessageFormat.format(MessageBundle.msg(key, locale),objects);
    }
    
   /**
    * 메지시를 리턴한다.
    */
    public static String msg(String key){
        return messageSource.getMessage(key, null, Locale.getDefault());
    }
    
    public static String msg(String key, Locale locale){
        return messageSource.getMessage(key, null, locale);
    }
}
