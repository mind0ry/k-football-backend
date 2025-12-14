package com.sist.web.service;

import java.util.List;

import com.sist.web.vo.*;

public interface MainService {
	
	public GameVO nextGameData();
	public List<PointTableVO> gamePointTable();
}
