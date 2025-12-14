package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.sist.web.mapper.MainMapper;
import com.sist.web.vo.GameVO;
import com.sist.web.vo.PointTableVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

	private final MainMapper mapper;
	
	@Override
	public GameVO nextGameData() {
		// TODO Auto-generated method stub
		return mapper.nextGameData();
	}

	@Override
	public List<PointTableVO> gamePointTable() {
		// TODO Auto-generated method stub
		return mapper.gamePointTable();
	}

}
