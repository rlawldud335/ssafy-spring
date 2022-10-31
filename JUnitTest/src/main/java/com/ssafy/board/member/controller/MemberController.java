package com.ssafy.board.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.board.member.model.dto.Member;
import com.ssafy.board.member.service.memberService;


@Controller
public class MemberController {
	
	@Autowired
	memberService memberService;
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String mvLogin(Model model) {
		return "/member/login";
	}
	
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String login(Member member, Model model) {
		
		return "";
	}

	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String mvJoin(Model model) {
		return "/member/join";
	}
	
	@RequestMapping(value="/member/join", method=RequestMethod.POST)
	public String join(Model model) {
		return "";
	}
}
