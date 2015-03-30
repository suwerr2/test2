package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.EventDao;
import com.ma2rix.music.dao.mapper.EventMapper;
import com.ma2rix.music.model.domain.Event;

@Repository
public class EventDaoImpl implements EventDao {

	@Autowired EventMapper eventMapper;

	@Override
	public int getEventCount() {
		return eventMapper.getEventCount();
	}

	@Override
	public ArrayList<Event> getAllEventList(int pageCount, int pageOffset) {
		return eventMapper.getAllEventList(pageCount, pageOffset);
	}

	@Override
	public void insertEvent(Event event) {
		eventMapper.insertEvent(event);
	}

	@Override
	public void deleteEvent(int eventNo) {
		eventMapper.deleteEvent(eventNo);
	}
}