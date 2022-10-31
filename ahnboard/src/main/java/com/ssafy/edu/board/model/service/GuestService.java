package com.ssafy.edu.board.model.service;

import java.util.List;

import com.ssafy.edu.board.model.GuestBook;

public interface GuestService {
	List<GuestBook> listArticle() throws Exception;
	GuestBook guestdetail(int articleNo) throws Exception;
	void writeArticle(GuestBook book) throws Exception;
	void guestupdate(GuestBook book) throws Exception;
	void guestdelete(int articleNo) throws Exception;
}
