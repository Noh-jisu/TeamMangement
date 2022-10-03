package com.management.team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.management.team.dto.ProjectDetailDto;

@Mapper
@Repository
public interface ProjectDetailDao {
	
	public int insertProjectD(ProjectDetailDto dto);
	
	public int checkProjectRegist(ProjectDetailDto dto);
	
	public int updateProjectD(ProjectDetailDto dto);
	
	public int deleteProjectD(int seq);
	
	public List<ProjectDetailDto> selectProjectD(ProjectDetailDto dto);

}
