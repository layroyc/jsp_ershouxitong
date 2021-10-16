package com.hp.dao;

import java.util.List;

import com.hp.entity.Score;

public interface ScoreDao {

	public List<Score> selectBySid(int sid);
}
