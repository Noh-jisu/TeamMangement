package com.management.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.team.dto.ProjectDetailDto;
import com.management.team.service.ProjectDetailService;

@RestController
public class ProjectDetailController {

	@Autowired
	ProjectDetailService service;
	
	// 진행한 프로젝트 신규등록
	@RequestMapping(value = "/insertProjectD", method = {RequestMethod.GET, RequestMethod.POST})
	public String checkId(ProjectDetailDto dto) {
		
		boolean b = service.insertProjectD(dto);
		
    	if(b) {
    		return "success";
    	} else {
    		return "false";
    	}
	}
	
	// 등록된 프로젝트 유무 확인
	@RequestMapping(value = "/checkProjectRegist", method = {RequestMethod.GET, RequestMethod.POST})
	public int checkProjectRegist(ProjectDetailDto dto) {
		return service.checkProjectRegist(dto);
	}
	
	// 진행한 프로젝트 수정
	@RequestMapping(value = "/updateProjectD", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateProjectD(ProjectDetailDto dto) {
		boolean b = service.updateProjectD(dto);
		
		if(b) {
    		return "success";
    	} else {
    		return "false";
    	}
	}
	
	//등록한 프로젝트 삭제
	@RequestMapping(value = "/deleteProjectD", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteProjectD(int seq) {
		boolean b = service.deleteProjectD(seq);
		
		if(b) {
    		return "success";
    	} else {
    		return "false";
    	}
	}
	
	// 등록한 프로젝트 조회
	@RequestMapping(value = "/selectProjectD", method = {RequestMethod.GET, RequestMethod.POST})
	public List<ProjectDetailDto> selectProjectD(ProjectDetailDto dto){
		return service.selectProjectD(dto);
	}
}
