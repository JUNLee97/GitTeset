package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.spring.dao.MessageDAO;
import kh.spring.dto.MessageDTO;

@Controller
public class HomeController {

	@Autowired
	public MessageDAO dao;

	@RequestMapping("/") //
	public String home() {

		return "home";
	}

	// 입력기능
//	@RequestMapping("")
//	public String insertMessage(MessageDTO dto) {
//
//		return;
//	}

	// 입력기능
//	@RequestMapping("")
//	public String insertMessage(MessageDTO dto) {
//
//		return;
//	}

}
