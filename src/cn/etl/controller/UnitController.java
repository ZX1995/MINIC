package cn.etl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.etl.dao.BaseDao;
import cn.etl.entity.Unit;
@Controller
@RequestMapping("/unit")
public class UnitController extends BaseController<Unit> {
	private BaseDao baseDao;
	@Override
	@Resource(name="unitDaoImpl")
	public void setBaseDao(BaseDao baseDao) {
		// TODO Auto-generated method stub
		this.baseDao = baseDao;
		super.setBaseDao(baseDao);
	}
	@RequestMapping("/findUnitsOfCourse")
	public @ResponseBody List<Unit> findUnitsOfCourse(Integer cId)
	{
		if(cId==null) return null;
		return baseDao.find("from Unit where uId.cId="+cId);
	}
}
