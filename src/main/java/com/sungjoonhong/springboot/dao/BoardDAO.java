package com.sungjoonhong.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sungjoonhong.springboot.domain.BoardVO;

@Mapper
public interface BoardDAO {
	
	@Select("SELECT * FROM sungjoonhong.board")
	public List<BoardVO> selectBoard() throws Exception;

	@Insert("INSERT INTO sungjoonhong.board(contents) VALUES(#{contents})")
	public void insertBoard(BoardVO member) throws Exception;
}
