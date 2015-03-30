package com.ma2rix.music.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ma2rix.music.dao.interfaces.BulletinDao;
import com.ma2rix.music.dao.mapper.BulletinMapper;
import com.ma2rix.music.model.domain.Bulletin;

@Repository
public class BulletinDaoImpl implements BulletinDao{
	
	@Autowired
	BulletinMapper bulletinMapper;

	@Override
	public ArrayList<Bulletin> getAllBulletin() {
		return bulletinMapper.getAllBulletin();
	}

}