package com.ma2rix.music.dao.interfaces;

import java.util.ArrayList;

import com.ma2rix.music.model.domain.Event;

public interface EventDao {
	public int getEventCount();
	public ArrayList<Event> getAllEventList(int pageCount, int pageOffset);
	public void insertEvent(Event event);
	public void deleteEvent(int eventNo);
}
