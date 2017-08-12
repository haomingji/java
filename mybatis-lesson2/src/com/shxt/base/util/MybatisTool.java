package com.shxt.base.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTool {
	static SqlSessionFactory sqlSessionFactory;
	
	static{
		
		try {
			//1. 读取核心配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			//2.创建session工厂 - 重量级的对象
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static SqlSession getSession() {
		//3.获取session对象
		SqlSession session = sqlSessionFactory.openSession();
		
		return session;
	}
}
