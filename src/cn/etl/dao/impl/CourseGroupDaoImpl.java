package cn.etl.dao.impl;

import org.springframework.stereotype.Repository;

import cn.etl.dao.CourseDao;
import cn.etl.dao.CourseGroupDao;
import cn.etl.entity.Course;
import cn.etl.entity.CourseGroup;
@Repository("courseGroupDaoImpl")
public class CourseGroupDaoImpl extends BaseDaoImpl<CourseGroup> implements CourseGroupDao{

}
