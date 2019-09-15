package com.sungjoonhong.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sungjoonhong.springboot.domain.MemberVO;

@Mapper
public interface MemberMapper {
	
	public List<MemberVO> selectMember() throws Exception;
	
	@Select("SELECT * FROM sungjoonhong.member")
	public List<MemberVO> selectMemberList2() throws Exception;
	
//	@Insert("INSERT INTO sungjoonhong.member(NAME) VALUES('TEST')")
	public void insertMember(MemberVO member) throws Exception;

}
