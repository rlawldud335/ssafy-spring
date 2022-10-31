package com.ssafy.board.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.board.member.model.dto.Member;
import com.ssafy.board.util.sqlMapConfig;

@Repository
public class memberDaoImpl implements memberDao {
	
	private final String NAMESPACE ="com.ssafy.board.member.model.dao.MemberDao";
	
	@Override
	public Member login(Member dto) throws Exception {
		try(SqlSession sqlSession = sqlMapConfig.getSqlSession()){
			return sqlSession.selectOne(NAMESPACE+"login", dto);
		}
	}

	@Override
	public int join(Member dto) throws Exception {
		try(SqlSession sqlSession = sqlMapConfig.getSqlSession()){
			return sqlSession.insert(NAMESPACE+"join",dto);
		}
	}

	@Override
	public int idCheck(String userId) throws Exception {
		try(SqlSession sqlSession = sqlMapConfig.getSqlSession()){
			return sqlSession.selectOne(NAMESPACE +"join", userId);
		}
	}

}
