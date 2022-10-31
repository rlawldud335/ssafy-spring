package com.ssafy.board.member.model.dao;

import com.ssafy.board.member.model.dto.Member;

public interface memberDao {
	Member login(Member dto) throws Exception;
	int join(Member dto) throws Exception;
	int idCheck(String userId) throws Exception;
}
