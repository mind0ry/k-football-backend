package com.sist.web.mapper;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

@Mapper
@Repository
public interface MainMapper {

	public GameVO nextGameData();
	public List<PointTableVO> gamePointTable();
	
}
