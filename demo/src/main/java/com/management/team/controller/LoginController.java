package com.management.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.team.dto.LoginDto;
import com.management.team.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService service;
	
	//아이디 중복체크
	@RequestMapping(value = "/checkId", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkId(String userId) {
		
		int check = service.checkId(userId);
    	
    	if(check > 0) {
    		return "notUse";
    	}else {
    		return "use";
    	}
		
	}
	
	// 회원가입
    @RequestMapping(value = "/signUp", method = {RequestMethod.GET, RequestMethod.POST})
    public String signUp(LoginDto dto){
    	
    	String userId = dto.getUserId();
    	
    	int check = service.checkId(userId);
    	
    	if(check > 0) {
    		return "notUse";
    	}else {
    		boolean b = service.signUp(dto);
            
            if(b == true) {
            	return "success";
            }else {
            	return "fail";
            }
    	}
    }
    
    // 로그인
    @RequestMapping(value = "/signUp", method = {RequestMethod.GET, RequestMethod.POST})
    public LoginDto login(LoginDto dto) {
    	return service.login(dto);
    }
    
}
