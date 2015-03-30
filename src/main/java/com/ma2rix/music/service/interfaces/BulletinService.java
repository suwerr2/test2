package com.ma2rix.music.service.interfaces;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.ma2rix.music.model.domain.Bulletin;

@Transactional
public interface BulletinService {

	public ArrayList<Bulletin> getAllBulletin();
	
}
