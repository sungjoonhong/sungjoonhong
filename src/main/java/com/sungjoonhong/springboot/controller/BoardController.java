package com.sungjoonhong.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sungjoonhong.springboot.domain.BoardVO;
import com.sungjoonhong.springboot.service.BoardService;

@Controller
public class BoardController {
	private Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService boardService;

	
	@RequestMapping("/selectBoard")
	public String selectBoard(Model model) throws Exception {
		//selectMember2 use mybatis annotation
		List<BoardVO> boardList = boardService.selectBoard();

		model.addAttribute("boardList", boardList);
		return "selectBoard";
	}
	
	
	@RequestMapping("/insertBoard")
	public String insertBoard(BoardVO board) throws Exception {
		logger.info("board = " + board.toString());
		//insertMember2 use mybatis annotation
		boardService.insertBoard(board);
		return "redirect:selectBoard";
	}
}
