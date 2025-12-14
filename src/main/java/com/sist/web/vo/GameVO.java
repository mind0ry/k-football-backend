package com.sist.web.vo;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

/*
 *  game_id	int
	kickoff_date	date
	kickoff_time	time
	round	int
	home_team	varchar(50)
	home_score	int
	away_score	int
	away_team	varchar(50)
	stadium	varchar(50)
	status	varchar(50)
 */
@Data
public class GameVO {
	private int game_id, round, home_score, away_score;
	private String home_team, away_team, status;
	private String home_logo, away_logo;
	private LocalDate kickoff_date;
	private LocalTime kickoff_time;
	
	private TeamVO tvo=new TeamVO();
}
