package com.management.team.dto;

/*
 SEQ					INT 			PRIMARY KEY AUTO_INCREMENT ,
 PROJECT_NUMBER			INT 			NOT NULL,
 PROJECT_NAME			VARCHAR(200) 	NOT NULL,
 PROJECT_DESCRIPTION	VARCHAR(4000) 			,
 START_DATE				VARCHAR(20) 	NOT NULL,
 END_DATE				VARCHAR(20) 			,
 SKILL					VARCHAR(300) 			,
 POSITION				VARCHAR(100) 			,
 USER_ID				VARCHAR(50),
 USER_NAME				VARCHAR(10)
*/

public class ProjectDetailDto {
	
	private int seq;
	private int projectNumber;
	private String projectName;
	private String projectDescription;
	private String startDate;
	private String endDate;
	private String skill;
	private String userId;
	private String userName;
	private String delYn;
	
	public ProjectDetailDto() {
		
	}

	public ProjectDetailDto(int seq, int projectNumber, String projectName, String projectDescription, String startDate,
			String endDate, String skill, String userId, String userName, String delYn) {
		super();
		this.seq = seq;
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.skill = skill;
		this.userId = userId;
		this.userName = userName;
		this.delYn = delYn;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "ProjectDetailDto [seq=" + seq + ", projectNumber=" + projectNumber + ", projectName=" + projectName
				+ ", projectDescription=" + projectDescription + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", skill=" + skill + ", userId=" + userId + ", userName=" + userName + ", delYn=" + delYn + "]";
	}
	
	
}
