package cn.etl.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UnitKey.class)
public class Unit extends BaseDomain{
	/**
	 * 课程组名称
	 */
	@Id
	private String gName;
	/**
	 * 在课程组里面的顺序
	 */
	@Id
	private int cIndex;
	/**
	 * 单元顺序
	 */
	@Id
	private int uIndex;
	/**
	 * 单元介绍
	 */
	private String uIntro;
	/**
	 * 单元名称(必）
	 */
	private String uName;
	

	public String getuIntro() {
		return uIntro;
	}
	
	public void setuIntro(String uIntro) {
		this.uIntro = uIntro;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
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

	public int getuIndex() {
		return uIndex;
	}

	public void setuIndex(int uIndex) {
		this.uIndex = uIndex;
	}

	@Override
	public Serializable key() {
		// TODO Auto-generated method stub
		return new UnitKey(gName, cIndex, uIndex);
	}
	
}
