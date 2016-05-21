package cn.etl.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
@IdClass(CourseKey.class)
public class Course extends BaseDomain {
	
	
	private String cName;
	/**
	 * 课程介绍
	 */
	private String cIntro;
	/**
	 * 学分（必）
	 */
	private String cRedits;
	/**
	 * 负责上传课件，微课，作业的老师
	 */
	private String chief;
	/**
	 * 课程组
	 */
	@Id
	private String gName;
	/**
	 * 课程在课程组中的顺序
	 */
	@Id
	private int cIndex;
	public String getChief() {
		return chief;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcIntro() {
		return cIntro;
	}
	public void setcIntro(String cIntro) {
		this.cIntro = cIntro;
	}
	public String getcRedits() {
		return cRedits;
	}
	public void setcRedits(String cRedits) {
		this.cRedits = cRedits;
	}
	public void setChief(String chief) {
		this.chief = chief;
	}
	
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getcIndex() {
		return cIndex;
	}
	public void setcIndex(int cIndex) {
		this.cIndex = cIndex;
	}
	@Override
	public Serializable key() {
		// TODO Auto-generated method stub
		return new CourseKey(gName, cIndex);
	}
	
}
