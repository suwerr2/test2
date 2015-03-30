package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.domain.Event;

@Transactional
public interface EventService {
	
	public static final int PAGE_OFFSET = 10;
	
	public int getEventCount();
	public ArrayList<Event> getAllEventList(int pageCount, int pageOffset);
	public void insertEvent(Event event);
	public void deleteEvent(int eventNo);
}