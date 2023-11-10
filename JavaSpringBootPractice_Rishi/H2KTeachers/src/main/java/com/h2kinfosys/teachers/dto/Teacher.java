package com.h2kinfosys.teachers.dto;

public class Teacher {
	
	private String teacherName;
	private String Skills;
	private int yrsOfExp;
	private String location;
	
	    public static final String TEACHER_NAME = "teacherName";
		public static final String TEACHER_SKILL = "Skills";
		public static final String YRS_OF_EXP = "yrsOfExp";
		public static final String LOCATION = "location";
	public Teacher() {
		
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", Skills=" + Skills + ", yrsOfExp=" + yrsOfExp + ", location="
				+ location + "]";
	}
		
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public int getYrsOfExp() {
		return yrsOfExp;
	}
	public void setYrsOfExp(int yrsOfExp) {
		this.yrsOfExp = yrsOfExp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
