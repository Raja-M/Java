		package com.h2kinfosys.teachers.bl;

import com.h2kinfosys.teachers.dao.TeacherDAO;
import com.h2kinfosys.teachers.dto.Teacher;

public class TeacherBo {
	private TeacherDAO teacherdao =null;
	public TeacherBo(){
		 
		TeacherDAO teacherdao = new TeacherDAO();
	}
	
	public String executeSaveTeacher(Teacher teacher) {
		String message = "";
		int num = teacherdao.createTeacher(teacher);
		if(num==1) {
			message = "Teacher saved successfully";
		}
		return message;
	}

}
