package cn.etl.entity;

import java.io.Serializable;

public class CourseKey implements Serializable{

	private static final long serialVersionUID = 2L;
	private String gName;
	private int cIndex;
	public CourseKey() {
		// TODO Auto-generated constructor stub
	}
	public CourseKey(String gName, int cIndex)
	{
		this.gName = gName;
		this.cIndex = cIndex;
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return gName.hashCode()+cIndex;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(null==obj || !(obj instanceof CourseKey)) return false;
		CourseKey c = (CourseKey)obj;
		if(cIndex==c.getcIndex()&&gName.equals(c.getgName())) return true;
		return false;
	}
}
