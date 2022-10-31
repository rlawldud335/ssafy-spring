package com.ssafy.board.member.service;

import com.ssafy.board.member.model.dto.Member;

public interface memberService {
	Member login(Member dto) throws Exception;
	int join(Member dto) throws Exception;
	int idCheck(String userId) throws Exception;
}
