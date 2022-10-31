package com.ssafy.edu.board.model.mapper;

import java.util.List;

import com.ssafy.edu.board.model.GuestBook;

public interface GuestBookMapper {
	List<GuestBook> listArticle() throws Exception;
	GuestBook guestdetail(int articleNo) throws Exception;
	void writeArticle(GuestBook book) throws Exception;
	void guestupdate(GuestBook book) throws Exception;
	void guestdelete(int articleNo) throws Exception;
}
