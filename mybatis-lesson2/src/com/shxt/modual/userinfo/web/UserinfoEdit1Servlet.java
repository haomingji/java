package com.shxt.modual.userinfo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shxt.modual.userinfo.domain.userinfo;
import com.shxt.modual.userinfo.service.UserinfoService;

/**
 * Servlet implementation class UserinfoEdit1Servlet
 */
@WebServlet("/UserinfoEdit1.do")
public class UserinfoEdit1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserinfoEdit1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String stat=request.getParameter("stat");
		String account=request.getParameter("account");
		String realname=request.getParameter("realname");
		userinfo u=new userinfo();
		u.setId(id);
		u.setAccount(account);
		u.setRealname(realname);
		u.setStat(stat);
		new UserinfoService().edit(u);
	}

}
