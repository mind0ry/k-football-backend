package com.sist.web.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.service.MainService;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class MainRestController {
	 
	private final MainService mService;
	
	@GetMapping("/main/next_game")
	public ResponseEntity<GameVO> next_game() {
		
		GameVO vo=new GameVO();
		try {
			vo=mService.nextGameData();
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}
	
	@GetMapping("/main/point_table")
	public ResponseEntity<List<PointTableVO>> point_table() {
		
		List<PointTableVO> list=new ArrayList();
		try {
			list=mService.gamePointTable();
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
