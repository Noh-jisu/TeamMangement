package com.management.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.team.dao.LoginDao;
import com.management.team.dto.LoginDto;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	LoginDao dao;
	
	public int checkId(String userId) {
		return dao.checkId(userId);
	}
	
	public boolean signUp(LoginDto dto) {
		
		int check = dao.signUp(dto);
		boolean b;
		
		if(check > 0) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
	
	public LoginDto login(LoginDto dto) {
		
		LoginDto login = dao.login(dto);
		
		return login;
	}
}
