package com.sungjoonhong.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sungjoonhong.springboot.dto.Member;
import com.sungjoonhong.springboot.service.MemberService;

@Controller
public class MemberController {
	@Autowired
    MemberService memberService;
	
	@RequestMapping("/member")
    public @ResponseBody List<Member> query() throws Exception{
        return memberService.selectMemberList();
    }




	

}
