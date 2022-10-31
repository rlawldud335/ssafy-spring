package com.ssafy.edu.member.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.member.model.Member;
import com.ssafy.edu.member.model.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	@Transactional
	public void registerMember(Member member) throws Exception {
		MemberMapper  mmapper =sqlSession.getMapper(MemberMapper.class);
		mmapper.registerMember(member);
	}

	@Override
	@Transactional(readOnly = true)
	public Member login(Member member) throws Exception {
		MemberMapper  mmapper =sqlSession.getMapper(MemberMapper.class);
		return mmapper.login(member);
	}

	@Override
	@Transactional(readOnly = true)
	public int idCheck(String userId) throws Exception {
		MemberMapper  mmapper =sqlSession.getMapper(MemberMapper.class);
		return mmapper.idCheck(userId);
	}

}
