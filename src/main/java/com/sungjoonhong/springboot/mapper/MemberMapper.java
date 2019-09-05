package com.sungjoonhong.springboot.mapper;

import java.util.List;

import com.sungjoonhong.springboot.dto.Member;
public interface MemberMapper {
	
	public List<Member> selectMemberList() throws Exception;

}
