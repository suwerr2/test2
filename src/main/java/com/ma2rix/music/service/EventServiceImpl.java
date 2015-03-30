package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.EventDao;
import com.ma2rix.music.model.domain.Event;
import com.ma2rix.music.service.interfaces.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired EventDao eventDao;
	
	@Override
	public int getEventCount() {
		return eventDao.getEventCount();
	}

	@Override
	public ArrayList<Event> getAllEventList(int pageCount, int pageOffset) {
		return eventDao.getAllEventList(pageCount, pageOffset);
	}

	@Override
	public void insertEvent(Event event) {
		eventDao.insertEvent(event);
	}

	@Override
	public void deleteEvent(int eventNo) {
		eventDao.deleteEvent(eventNo);
	}
}