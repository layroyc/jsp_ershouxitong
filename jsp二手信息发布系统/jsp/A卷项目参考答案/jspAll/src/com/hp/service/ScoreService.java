package com.hp.service;

import java.util.List;

import com.hp.entity.Score;

public interface ScoreService {
	
	public List<Score> selectBySid(int sid);

}
