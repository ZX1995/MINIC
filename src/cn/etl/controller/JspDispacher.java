package cn.etl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.etl.dao.CourseDao;
import cn.etl.dao.CourseGroupDao;
import cn.etl.dao.UnitDao;
import cn.etl.settting.Constant;

@Controller
@RequestMapping("")
public class JspDispacher {
	@Resource(name="courseDaoImpl")
	private CourseDao courseDao;
	@Resource(name="courseGroupDaoImpl")
	private CourseGroupDao courseGroupDao;
	@Resource(name="unitDaoImpl")
	private UnitDao unitDao;
	@RequestMapping("/home")
	public String Home()
	{
		
		return Constant.HOME;
	}
	@RequestMapping("/loginPage")
	public String loginPage()
	{
		return Constant.LOGIN;
	}
}
