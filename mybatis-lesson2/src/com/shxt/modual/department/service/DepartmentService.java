package com.shxt.modual.department.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shxt.base.util.MybatisTool;
import com.shxt.modual.department.domain.Department;


public class DepartmentService {
public List<Department> list(){
	SqlSession session=MybatisTool.getSession();
	return session.selectList(Department.class.getName()+".list");
}
}
