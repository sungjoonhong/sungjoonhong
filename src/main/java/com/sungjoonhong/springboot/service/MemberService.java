package com.sungjoonhong.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sungjoonhong.springboot.dto.Member;
import com.sungjoonhong.springboot.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;
    
    public List<Member> selectMemberList() throws Exception{
        return memberMapper.selectMemberList();
    }



}
