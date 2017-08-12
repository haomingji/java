package com.shxt.modual.userinfo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shxt.modual.userinfo.service.UserinfoService;

/**
 * Servlet implementation class UserinfoDeleteServlet
 */
@WebServlet("/UserinfoDelete.do")
/**
 * 删除员工
 * @author 纪浩铭
 * @ClassName: UserinfoDeleteServlet
 * @Version 1.0 
 * @Copyright 四海兴唐
 * @date 2017年8月11日 下午8:06:16
 * @description
 */
public class UserinfoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		System.out.println(id);
		new UserinfoService().delete(id);
		
	}

}
