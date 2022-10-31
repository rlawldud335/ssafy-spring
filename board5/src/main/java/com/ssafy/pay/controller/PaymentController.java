package com.ssafy.pay.controller;

import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ssafy.board.model.BoardDto;
import com.ssafy.board.model.FileInfoDto;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.service.MemberService;
import com.ssafy.pay.model.PaymentDto;
import com.ssafy.pay.model.service.PaymentService;
import com.ssafy.util.PageNavigation;

@Controller
@RequestMapping("/pay")
public class PaymentController {

	private final Logger logger = LoggerFactory.getLogger(PaymentController.class);

	private final PaymentService paymentService;
	private final MemberService memberService;
	
	@Autowired
	public PaymentController(PaymentService paymentService, 
			MemberService memberService) {
		this.paymentService = paymentService;
		this.memberService=memberService;
	}

	
	@GetMapping("/write")
	public String write( Model model) throws SQLException {
		logger.debug("write  ");
		model.addAttribute("members", memberService.members());
		return "pay/write";
	}
	@PostMapping("/write")
	public String write2(PaymentDto payment, Model model) throws SQLException {
		logger.debug("write  {}", payment);
		paymentService.write(payment);
		return "redirect:/pay/list";
	}
	@GetMapping("/list")
	public String list( Model model) throws SQLException {
		logger.debug("list  ");
		model.addAttribute("lists", paymentService.lists());
		return "pay/list";
	}
}