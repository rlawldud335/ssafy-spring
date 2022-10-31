package com.ssafy.member.model.dao;

import java.sql.SQLException;
import java.util.Map;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.member.model.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	private final String NAMESPACE = "com.ssafy.member.model.dao.MemberDao.";

	@Autowired
	SqlSession sqlSession;
	
	@Override
	@Transactional(readOnly=true)
	public int idCheck(String userId) throws SQLException {
		return sqlSession.selectOne(NAMESPACE + "idCheck", userId);
	}

	@Override
	@Transactional
	public void joinMember(MemberDto memberDto) throws SQLException {
		sqlSession.insert(NAMESPACE + "joinMember", memberDto);
	}

	@Override
	@Transactional(readOnly=true)
	public MemberDto loginMember(Map<String, String> map) throws SQLException {
		return sqlSession.selectOne(NAMESPACE + "loginMember", map);
	}

}
