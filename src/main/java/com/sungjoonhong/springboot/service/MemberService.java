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

	public List<MemberVO> selectMember() throws Exception {
		return memberMapper.selectMember();
	}
	
	public List<MemberVO> selectMember2() throws Exception {
		return memberMapper.selectMember2();
	}
	
	public void insertMember(MemberVO member) throws Exception {
		memberMapper.insertMember(member);
	}
	
	public void insertMember2(MemberVO member) throws Exception {
		memberMapper.insertMember2(member);
	}

}
