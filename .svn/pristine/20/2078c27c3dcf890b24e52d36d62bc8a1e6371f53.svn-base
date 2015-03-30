/**
 * 개발일자:2014.11.03
 * 개발자:김기수
 * 컨트롤러 설명 : 차트 관련 서비스
 * 
 * @author v
 *
 */

package com.ma2rix.music.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ma2rix.music.dao.interfaces.RankDao;
import com.ma2rix.music.model.command.RankCommand;
import com.ma2rix.music.service.interfaces.RankService;

@Service
public class RankServiceImpl implements RankService {

	@Autowired RankDao rankDao;

	@Override
	public int getRankCount(String rType, int genreNo, int isSelected, int isRecom, int isRecent) {
		return rankDao.getRankCount(rType, genreNo, isSelected, isRecom, isRecent);
	}	
	
	@Override
	public ArrayList<RankCommand> getRankCommandList(String rType, int genreNo, int limitNum, int isSelected, int isRecom, int isRecent, int orderBy) {
		return rankDao.getRankCommandList(rType, genreNo, limitNum, isSelected, isRecom, isRecent, orderBy);
	}

}
