package com.management.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.team.dao.ProjectDetailDao;
import com.management.team.dto.ProjectDetailDto;

@Service
@Transactional
public class ProjectDetailService {
	
	@Autowired
	ProjectDetailDao dao;
	
	// 진행한 프로젝트 신규등록
	public boolean insertProjectD(ProjectDetailDto dto) {
		int check = dao.insertProjectD(dto);
	
		return check>0?true:false;
	}
	
	// 등록된 프로젝트 유무 확인
	public int checkProjectRegist(ProjectDetailDto dto) {
		return dao.checkProjectRegist(dto);
	}
	
	// 진행한 프로젝트 수정
	public boolean updateProjectD(ProjectDetailDto dto) {
		int check = dao.updateProjectD(dto);
		
		return check>0?true:false;		
	}
	
	// 등록한 프로젝트 삭제
	public boolean deleteProjectD(int seq) {
		int check = dao.deleteProjectD(seq);
		
		return check>0?true:false;
	}
	
	// 등록한 프로젝트 조회
	public List<ProjectDetailDto> selectProjectD(ProjectDetailDto dto) {
		List<ProjectDetailDto> list = dao.selectProjectD(dto);
		
		return list;
	}
	
}
