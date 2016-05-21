package cn.etl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.etl.dao.BaseDao;
import cn.etl.entity.CourseGroup;
@Controller
@RequestMapping("/cg")
public class CourseGroupController extends BaseController<CourseGroup> {
	private BaseDao baseDao;
	@Override
	@Resource(name="courseGroupDaoImpl")
	public void setBaseDao(BaseDao baseDao) {
		// TODO Auto-generated method stub
		this.baseDao = baseDao;
		super.setBaseDao(baseDao);
	}
}
