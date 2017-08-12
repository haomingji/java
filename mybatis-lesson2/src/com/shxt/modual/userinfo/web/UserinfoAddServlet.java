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


@WebServlet("/UserinfoAdd.do")
/**
 * 添加书籍
 * @author 纪浩铭
 * @ClassName: UserinfoAddServlet
 * @Version 1.0 
 * @Copyright 四海兴唐
 * @date 2017年8月11日 下午4:03:13
 * @description
 */
public class UserinfoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Department> dep_list=new DepartmentService().list();
		request.setAttribute("dep_list", dep_list);
		request.getRequestDispatcher("/userinfo/userinfoadd.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		userinfo u=new userinfo();
		u.setAccount(request.getParameter("account"));
		u.setRealname(request.getParameter("realname"));
		u.setSex(request.getParameter("sex"));
		u.setStat(request.getParameter("stat"));
		u.setDepartment_id(request.getParameter("department"));
		new UserinfoService().add(u);
		response.sendRedirect("userinfo/userinfo.jsp");
		
		
		
	}

}
