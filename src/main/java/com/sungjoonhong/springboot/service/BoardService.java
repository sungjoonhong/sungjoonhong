package com.sungjoonhong.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sungjoonhong.springboot.dao.BoardDAO;
import com.sungjoonhong.springboot.domain.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDao;
	
	public List<BoardVO> selectBoard() throws Exception {
		return boardDao.selectBoard();
	}
	
	public void insertBoard(BoardVO member) throws Exception {
		boardDao.insertBoard(member);
	}

}
