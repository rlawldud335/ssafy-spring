package com.ssafy.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssafy.edu.member.model.Member;
import com.ssafy.edu.member.model.service.MemberService;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(GuestBookController.class);
	
	@Autowired
	MemberService mservice;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String login(Member member,Model model) throws Exception {
		logger.debug("Welcome guestwrite {}", member);
		Member login = mservice.login(member);
		if(login!=null) {
			
		}else {
			
		}
		return "home";
	}
}
