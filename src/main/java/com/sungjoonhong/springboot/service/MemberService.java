package com.sungjoonhong.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sungjoonhong.springboot.dao.MemberDAO;
import com.sungjoonhong.springboot.domain.MemberVO;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDao;

	public List<MemberVO> selectMember() throws Exception {
		return memberDao.selectMember();
	}
	
	public List<MemberVO> selectMember2() throws Exception {
		return memberDao.selectMember2();
	}
	
	public void insertMember(MemberVO member) throws Exception {
		memberDao.insertMember(member);
	}
	
	public void insertMember2(MemberVO member) throws Exception {
		memberDao.insertMember2(member);
	}

}
