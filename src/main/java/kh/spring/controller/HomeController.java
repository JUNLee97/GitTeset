package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.MessageDAO;
import kh.spring.dto.MessageDTO;

@Controller
public class HomeController {

	@Autowired
	public MessageDAO dao;

	@RequestMapping("/") 
	public String home() {
		return "home";
	}

	// 입력기능
	@RequestMapping("insertMessage")
	public String insertMessage(MessageDTO dto, Model model) {
		int result = dao.insert(dto);
		
		model.addAttribute("result",result);
		return "home";
	}
   

	// 입력기능
//	@RequestMapping("")
//	public String insertMessage(MessageDTO dto) {
//
//		return;
//	}

}
