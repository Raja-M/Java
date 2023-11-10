package com.h2kinfosys.teachers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2kinfosys.teachers.bl.TeacherBo;
import com.h2kinfosys.teachers.dto.Teacher;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet(description = "Teacher Servlet", urlPatterns = { "/teacher" })
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private TeacherBo teacherbo;
     
     
     @Override
     public void init() throws ServletException{
    	 teacherbo = new TeacherBo();
     }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Teacher teacher = new Teacher();
		
		teacher.setTeacherName(request.getParameter(teacher.TEACHER_NAME));
		teacher.setSkills(request.getParameter(teacher.TEACHER_SKILL));
		teacher.setYrsOfExp(Integer.parseInt(request.getParameter(teacher.YRS_OF_EXP)));
		teacher.setLocation(request.getParameter(teacher.LOCATION));
		
		String message =teacherbo.executeSaveTeacher(teacher);
		PrintWriter pw = response.getWriter();
		
		pw.print(message);
	}

}
