package com.sungjoonhong.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sungjoonhong.springboot.domain.MemberVO;

@Mapper
public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;
	
	@Select("SELECT * FROM sungjoonhong.member")
	public List<MemberVO> selectMember2() throws Exception;
	
	public void insertMember(MemberVO member) throws Exception;
	
	@Insert("INSERT INTO sungjoonhong.member(name) VALUES(#{name})")
	public void insertMember2(MemberVO member) throws Exception;

}
