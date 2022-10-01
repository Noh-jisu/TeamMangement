package com.management.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.team.dao.ProjectDetailDao;

@Service
@Transactional
public class ProjectDetailService {
	
	@Autowired
	ProjectDetailDao dao;
}
