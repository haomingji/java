package com.shxt.Util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTool {

	 static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			//读取mybatis核心被指文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			//创建session工厂
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSession getSession() {
 //创建session对象
		SqlSession session=sqlSessionFactory.openSession();
		return session;
}
}
