package com.shxt.modual.userinfo.service;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.shxt.base.util.MybatisTool;
import com.shxt.modual.userinfo.domain.userinfo;

public class UserinfoService {
   /**
    * 查询
    * @author 纪浩铭
    * @title: list
    * @date 2017年8月11日 下午4:36:50
    * @return List<userinfo>
    */
	public List<userinfo> list(){
		SqlSession session=MybatisTool.getSession();
		return session.selectList(userinfo.class.getName() + ".list");
	}
	
	public void add(userinfo u) {
		u.setId(UUID.randomUUID().toString());
		SqlSession session=MybatisTool.getSession();
		session.insert(userinfo.class.getName()+".add",u);
		session.commit();
	}

	public void delete(String id) {
		SqlSession session=MybatisTool.getSession();
		session.delete(userinfo.class.getName() + ".delete",id);
		session.commit();
		
	}
	public void edit(userinfo u) {
		SqlSession session=MybatisTool.getSession();
		session.update(userinfo.class.getName()+".edit",u);
		session.commit();
		
	}

	public userinfo get(String id) {
		SqlSession session=MybatisTool.getSession();
		 return session.selectOne(userinfo.class.getName()+".get",id);
	}
}
