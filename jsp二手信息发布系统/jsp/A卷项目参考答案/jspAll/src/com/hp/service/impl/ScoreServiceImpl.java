package com.hp.service.impl;

import java.util.List;

import com.hp.dao.ScoreDao;
import com.hp.dao.impl.ScoreDaoImpl;
import com.hp.entity.Score;
import com.hp.service.ScoreService;

public class ScoreServiceImpl implements ScoreService {
	
	ScoreDao sd = new ScoreDaoImpl();

	@Override
	public List<Score> selectBySid(int sid) {
		// TODO Auto-generated method stub
		return sd.selectBySid(sid);
	}

}
