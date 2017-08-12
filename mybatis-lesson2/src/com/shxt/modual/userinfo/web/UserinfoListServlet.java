package com.shxt.modual.userinfo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.shxt.modual.userinfo.domain.userinfo;
import com.shxt.modual.userinfo.service.UserinfoService;



@WebServlet("/UserinfoList.do")
/**
 * 
 * 查询员工
 * @author 纪浩铭
 * @ClassName: UserinfoListServlet
 * @Version 1.0 
 * @Copyright 四海兴唐
 * @date 2017年8月11日 下午3:52:54
 * @description
 */
public class UserinfoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<userinfo> userinfolist=new UserinfoService().list();
      response.setContentType("text/json;charset=utf-8");
		
		PrintWriter out = response.getWriter();
	String s = new Gson().toJson(userinfolist);
		
		out.print(s);
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
