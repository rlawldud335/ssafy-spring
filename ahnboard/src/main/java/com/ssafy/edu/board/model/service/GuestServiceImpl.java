package com.ssafy.edu.board.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.board.model.GuestBook;
import com.ssafy.edu.board.model.mapper.GuestBookMapper;
@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	@Transactional(readOnly = true)
	public List<GuestBook> listArticle() throws Exception {
		GuestBookMapper gmapper=sqlSession.getMapper(GuestBookMapper.class);
		return gmapper.listArticle();
	}
	
	@Override
	@Transactional(readOnly = true)
	public GuestBook guestdetail(int articleNo) throws Exception {
		GuestBookMapper gmapper=sqlSession.getMapper(GuestBookMapper.class);
		return gmapper.guestdetail(articleNo);
	}

	@Override
	@Transactional
	public void writeArticle(GuestBook book) throws Exception {
		GuestBookMapper gmapper=sqlSession.getMapper(GuestBookMapper.class);
		gmapper.writeArticle(book);
	}

	@Override
	@Transactional
	public void guestupdate(GuestBook book) throws Exception {
		GuestBookMapper gmapper=sqlSession.getMapper(GuestBookMapper.class);
		gmapper.guestupdate(book);
	}

	@Override
	@Transactional
	public void guestdelete(int articleNo) throws Exception {
		GuestBookMapper gmapper=sqlSession.getMapper(GuestBookMapper.class);
		gmapper.guestdelete(articleNo);
	}

}
