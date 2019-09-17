package com.sungjoonhong.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sungjoonhong.springboot.domain.MemberVO;
import com.sungjoonhong.springboot.service.MemberService;

@Controller
public class MemberController {

	//slf4j logback
	private Logger logger = LoggerFactory.getLogger(MemberController.class);

	
	@Autowired
	MemberService memberService;

//	@RequestMapping("/selectMember")
//	public ModelAndView selectMember() throws Exception {
//		List<MemberVO> memberList = memberService.selectMember();
//
//		//JSP name
//		ModelAndView member = new ModelAndView("selectMember");
//		
//		member.addObject("memberList", memberList);
//		return member;
//	}
	
	//change controller
	@RequestMapping("/selectMember")
	public String selectMember(Model model) throws Exception {
		//selectMember2 use mybatis annotation
		List<MemberVO> memberList = memberService.selectMember2();

		//JSP name
//		ModelAndView member = new ModelAndView("selectMember");
		
		model.addAttribute("memberList", memberList);
		return "selectMember";
	}
	
	@RequestMapping("/insertMember")
	public String insertMember(MemberVO member) throws Exception {
		logger.info("member = " + member.toString());
		//insertMember2 use mybatis annotation
		memberService.insertMember2(member);
		return "redirect:selectMember";
	}

}
