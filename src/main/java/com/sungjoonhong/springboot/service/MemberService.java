package com.sungjoonhong.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sungjoonhong.springboot.dao.MemberMapper;
import com.sungjoonhong.springboot.domain.MemberVO;

@Service
public class MemberService {

	@Autowired
	MemberMapper memberMapper;

	public List<MemberVO> selectMemberList() throws Exception {
		return memberMapper.selectMemberList();
	}
	
	public List<MemberVO> selectMemberList2() throws Exception {
		return memberMapper.selectMemberList();
	}

}
