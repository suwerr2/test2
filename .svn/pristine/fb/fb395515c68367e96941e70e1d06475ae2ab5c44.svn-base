package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.BulletinDao;
import com.ma2rix.music.model.domain.Bulletin;
import com.ma2rix.music.service.interfaces.BulletinService;

@Service
public class BulletinServiceImpl implements BulletinService {

	@Autowired
	BulletinDao bulletinDao;

	@Override
	public ArrayList<Bulletin> getAllBulletin() {
		return bulletinDao.getAllBulletin();
	}
	
}