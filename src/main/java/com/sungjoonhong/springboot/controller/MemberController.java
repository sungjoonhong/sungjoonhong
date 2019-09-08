package com.sungjoonhong.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sungjoonhong.springboot.domain.MemberVO;
import com.sungjoonhong.springboot.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/member")
	public ModelAndView query() throws Exception {
		List<MemberVO> memberList = memberService.selectMemberList();
		ModelAndView member = new ModelAndView("member");
		member.addObject("memberList", memberList);
		return member;
	}

}
