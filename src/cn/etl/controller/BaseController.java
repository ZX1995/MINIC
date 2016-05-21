package cn.etl.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import cn.etl.dao.BaseDao;
import cn.etl.settting.Constant;
public  class BaseController<T>{
	private Class<T> entityClass;
	protected BaseDao<T> baseDao;

	public Class<T> getEntityClass() {
		return entityClass;
	}
	public void setBaseDao(BaseDao baseDao)
	{
		this.baseDao = baseDao;
	}
	
	//列出所有记录 ,返回json串
	@RequestMapping("/list")
	public @ResponseBody List<T> list()
	{
		List<T> list=baseDao.loadAll();
		return list;
	}
	//列出所有记录 ,返回页面
	@RequestMapping("/listRView")
	public ModelAndView listRView(String view){
		List<T> list=baseDao.loadAll();
		ModelAndView mav=new ModelAndView(view);
		mav.addObject("list", list);
		return mav;
	}
	@RequestMapping("/findOne")
	public @ResponseBody T findOneById(T entity)
	{
		return baseDao.get(entity);
	}

	@RequestMapping("/add")
	public void add(T entity,HttpServletResponse res) throws IOException
	{
		String msg="添加成功";
		if(!baseDao.save(entity))
			msg="添加失败";
		res.getWriter().println(msg);
	}
	@RequestMapping("/addRView")
	public ModelAndView addRView(T entity,String view)
	{
		String msg="添加成功";
		if(!baseDao.save(entity))
			msg="添加失败";
		ModelAndView mav=new ModelAndView(view);
		mav.addObject("msg",msg);
		return mav;
	}
	
	@RequestMapping("/deleteById")
	public void deleteById(Integer[] id)
	{
		if(id==null) return ;
		for(Serializable s:id)
			baseDao.remove(s);
	}
	@RequestMapping("/deleteByUsername")
	public void deleteByUsername(String[] username)
	{
		if(username==null) return ;
		for(Serializable s:username)
			baseDao.remove(s);
	}
	@RequestMapping("/getPage")
	public @ResponseBody List<T> getPage(Integer pageIndex,Integer pageSize)
	{
		if(pageIndex==null) pageIndex=1;
		if(pageSize==null) pageSize=Constant.PAGE_SIZE.get(entityClass.getSimpleName());
		return baseDao.getPage(pageIndex, pageSize).getData();
	}
	
	
	
}