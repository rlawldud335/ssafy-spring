package com.ssafy.board.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.member.model.dao.memberDao;
import com.ssafy.board.member.model.dto.Member;


@Service
public class memberServiceImpl implements memberService {

	@Autowired
	memberDao mapper;
	
	@Override
	public Member login(Member dto) throws Exception {
		return mapper.login(dto);
	}

	@Override
	public int join(Member dto) throws Exception {
		return mapper.join(dto);
	}

	@Override
	public int idCheck(String userId) throws Exception {
		return mapper.idCheck(userId);
	}

}
