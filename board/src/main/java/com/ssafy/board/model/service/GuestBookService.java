package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.GuestBookDto;

public interface GuestBookService {

	List<GuestBookDto> listArticle() throws Exception;
	void writeArticle(GuestBookDto book) throws Exception;
	GuestBookDto detailArticle(int articleNo) throws Exception;
	void updateArticle(GuestBookDto book)throws Exception;
}
