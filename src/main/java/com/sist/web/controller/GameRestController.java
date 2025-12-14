package com.sist.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.service.GameService;
import com.sist.web.vo.GameVO;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class GameRestController {

	private final GameService gService;
	
	@GetMapping("/game/list")
	public ResponseEntity<List<GameVO>> game_list(@RequestParam(name = "round", required = false) Integer round,
			@RequestParam(name = "team", required = false) String team) {
		
		List<GameVO> list=new ArrayList<>();
		try {
			Map map=new HashMap();
			map.put("round", round);
			map.put("team", team);
			
			list=gService.gameListData(map);
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
