package com.management.team.dto;

/*
SEQ			INT 			PRIMARY KEY AUTO_INCREMENT,
USER_ID		VARCHAR(50) 	NOT NULL,
USER_PWD	VARCHAR(50) 	NOT NULL,
USER_NAME	VARCHAR(10) 	NOT NULL,
AGE			VARCHAR(2) 		NOT NULL,
TEL			VARCHAR(16) 			,
PART		VARCHAR(200) 			,
SKILL_STACK	VARCHAR(100) 	NOT NULL,
POSITION	VARCHAR(10) 			,
CAREER		VARCHAR(20)				,
NOW_PROJECT	INT(8)					,
DEL_YN		VARCHAR(1) 				,
USER_NUMBER	CHAR(1) 		NOT NULL,
IN_DATE		VARCHAR(20) 	NOT NULL,
OUT_DATA	VARCHAR(20) 	NOT NULL,
ING_YN		VARCHAR(1) 		NOT NULL
*/

public class LoginDto {
	
	private int 	seq;
	private String 	userId;
	private String 	userPwd;
	private String 	userName;
	private String 	age;
	private String 	tel;
	private String 	part;
	private String 	skillStack;
	private String 	position;
	private String 	career;
	private String 	nowProject;
	private String 	delYn;
	private String 	userNumber;
	private String 	inDate;
	private String 	outData;
	private String 	ingYn; 
	
	public LoginDto() {
		
	}

	public LoginDto(int seq, String userId, String userPwd, String userName, String age, String tel, String part,
			String skillStack, String position, String career, String nowProject, String delYn, String userNumber,
			String inDate, String outData, String ingYn) {
		super();
		this.seq = seq;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.tel = tel;
		this.part = part;
		this.skillStack = skillStack;
		this.position = position;
		this.career = career;
		this.nowProject = nowProject;
		this.delYn = delYn;
		this.userNumber = userNumber;
		this.inDate = inDate;
		this.outData = outData;
		this.ingYn = ingYn;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getSkillStack() {
		return skillStack;
	}

	public void setSkillStack(String skillStack) {
		this.skillStack = skillStack;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getNowProject() {
		return nowProject;
	}

	public void setNowProject(String nowProject) {
		this.nowProject = nowProject;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getOutData() {
		return outData;
	}

	public void setOutData(String outData) {
		this.outData = outData;
	}

	public String getIngYn() {
		return ingYn;
	}

	public void setIngYn(String ingYn) {
		this.ingYn = ingYn;
	}

	@Override
	public String toString() {
		return "LoginDto [seq=" + seq + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", age=" + age + ", tel=" + tel + ", part=" + part + ", skillStack=" + skillStack + ", position="
				+ position + ", career=" + career + ", nowProject=" + nowProject + ", delYn=" + delYn + ", userNumber="
				+ userNumber + ", inDate=" + inDate + ", outData=" + outData + ", ingYn=" + ingYn + "]";
	}
}
