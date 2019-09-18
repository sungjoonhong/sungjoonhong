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

	@Insert("INSERT INTO sungjoonhong.board(title, writer, contents) VALUES(#{title}, #{writer}, #{contents})")
	public void insertBoard(BoardVO board) throws Exception;
	
	@Select("SELECT * FROM sungjoonhong.board where bno=#{bno}")
	public BoardVO readBoard(BoardVO board) throws Exception;
}
