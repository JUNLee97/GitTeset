package kh.spring.controller;

import java.util.List;

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
	
	
	@RequestMapping("list")
	 public String list(Model model) {
		System.out.println("성공적으로 리스트에 들어옴");
		
		List<MessageDTO> list = dao.messageList();
		model.addAttribute("list", list);
		
		
		return "list";
	}
	
	
	
   

	// 입력기능
//	@RequestMapping("")
//	public String insertMessage(MessageDTO dto) {
//
//		return;
//	}

}
