package com.management.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.management.team.service.ProjectDetailService;

@RestController
public class ProjectDetailController {

	@Autowired
	ProjectDetailService service;
}
