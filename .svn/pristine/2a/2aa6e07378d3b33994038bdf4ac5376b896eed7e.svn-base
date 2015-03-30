package com.ma2rix.music.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ma2rix.music.model.domain.Event;

public interface EventMapper {
	public int getEventCount();
	public ArrayList<Event> getAllEventList(
			@Param("pageCount") int pageCount, 
			@Param("pageOffset") int pageOffset);
	public void insertEvent(Event event);
	public void deleteEvent(int eventNo);
	
}
