package cn.etl.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.etl.dao.BaseDao;
import cn.etl.entity.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController<Admin>{
	private BaseDao baseDao;
	@Override
	@Resource(name="adminDaoImpl")
	public void setBaseDao(BaseDao baseDao) {
		// TODO Auto-generated method stub
		this.baseDao = baseDao;
		super.setBaseDao(baseDao);
	}
}
