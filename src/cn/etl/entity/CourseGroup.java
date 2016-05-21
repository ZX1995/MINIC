package cn.etl.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;

@Entity
public class CourseGroup extends BaseDomain{
	/**
	 * 课程组名称
	 */
	@Id
	private String gName;
	/**
	 * 课程组索引
	 */
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER,mappedBy="gName")
	@OrderBy("cIndex")
	private List<Course> courses;
	private int gIndex;
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	@Column(unique=true)
	public int getgIndex() {
		return gIndex;
	}
	public void setgIndex(int gIndex) {
		this.gIndex = gIndex;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public Serializable key() {
		// TODO Auto-generated method stub
		return gName;
	}
}
