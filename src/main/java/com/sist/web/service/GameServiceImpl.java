package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.GameMapper;
import com.sist.web.vo.GameVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
	
	private final GameMapper mapper;
	
	@Override
	public List<GameVO> gameListData(Map map) {
		// TODO Auto-generated method stub
		return mapper.gameListData(map);
	}

	
}
