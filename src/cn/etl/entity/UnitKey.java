package cn.etl.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class UnitKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String gName;
	private int cIndex;
	private int uIndex;
	public UnitKey() {
		// TODO Auto-generated constructor stub
	}
	public UnitKey(String gName,int cIndex,int uIndex)
	{
		this.gName = gName;
		this.cIndex = cIndex;
		this.uIndex = uIndex;
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(null==obj||!(obj instanceof UnitKey)) return false;
		UnitKey unitkey=(UnitKey)obj;
		if(cIndex==unitkey.getcIndex()&&uIndex==unitkey.getuIndex()&&unitkey.getgName().equals(gName)) return true;
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return gName.hashCode()+cIndex+uIndex;
	}
}
