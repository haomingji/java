package com.shxt.web.student;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shxt.domian.Student;
import com.shxt.util.MybatisTool;
@Controller
@RequestMapping("/student")
public class StudentController {
public static void main(String[] args) {
	
}
	@RequestMapping(value="/add",method=RequestMethod.GET)
    public ModelAndView add() {
	ModelAndView mav=new ModelAndView("student/student_add");
	return mav;
}
	@RequestMapping(value="/add",method=RequestMethod.POST)
    public ModelAndView add1(Student s) {
		SqlSession session=MybatisTool.getSession();
		s.setId(UUID.randomUUID().toString());
		session.insert(Student.class.getName()+".add",s);
		session.commit();
	ModelAndView mav=new ModelAndView("redirect:/student/list");
	return mav;
}
	@RequestMapping(value="/list")
    public ModelAndView list() {
		ModelAndView mav=new ModelAndView("student/student_list");
		SqlSession session=MybatisTool.getSession();
		List<Student> list=session.selectList(Student.class.getName()+".list");
		mav.addObject("list", list);
	    return mav;
}
	@RequestMapping(value="/edit",method=RequestMethod.GET)
    public ModelAndView edit(String id) {
	ModelAndView mav=new ModelAndView("student/student_edit");
	SqlSession session=MybatisTool.getSession();
	Student s=session.selectOne(Student.class.getName()+".get",id);
	mav.addObject("s", s);
	return mav;
}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
    public ModelAndView edit1(Student stu) {
	ModelAndView mav=new ModelAndView("redirect:/student/list");
	SqlSession session=MybatisTool.getSession();
	session.update(Student.class.getName()+".edit",stu);
	session.commit();
	return mav;
}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
    public ModelAndView delete(String id) {
	ModelAndView mav=new ModelAndView("redirect:/student/list");
	SqlSession session=MybatisTool.getSession();
	session.delete(Student.class.getName()+".delete",id);
	session.commit();
	return mav;
}
}
