package com.shxt.modual.userinfo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shxt.modual.department.domain.Department;
import com.shxt.modual.department.service.DepartmentService;
import com.shxt.modual.userinfo.domain.userinfo;
import com.shxt.modual.userinfo.service.UserinfoService;


/**
 * Servlet implementation class UserinfoEditServlet
 */
@WebServlet("/UserinfoEdit.do")
public class UserinfoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String id = request.getParameter("id");
		
		userinfo u=new UserinfoService().get(id);
		request.setAttribute("userinfo", u);
		
		List<Department> dep_list=new DepartmentService().list();
		request.setAttribute("dep_list", dep_list);
		request.getRequestDispatcher("/userinfo/userinfo.jsp").forward(request, response);
		
	}

}
