package kh.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MessageDTO;

@Repository
public class MessageDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	
	
	// 입력 기능
	public int insert(MessageDTO dto) {
	
		return mybatis.insert("Message.insert",dto); 
		
	}
	
	
		
	// 출력 기능
	public List<MessageDTO> messageList() {
		return mybatis.selectList("Message.selectAll");
	}
	
	
	
}
