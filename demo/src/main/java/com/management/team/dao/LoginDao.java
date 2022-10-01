package com.management.team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.management.team.dto.LoginDto;

@Mapper
@Repository
public interface LoginDao {
	
	public int checkId(String userId);
	
	public int signUp(LoginDto dto);
	
	public LoginDto login(LoginDto dto);
}
