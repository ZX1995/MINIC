package cn.etl.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@MappedSuperclass  
public class User extends BaseDomain{
	/**
	 * 用户名（必）
	 */
	@Id
	private String username;
	/**
	 * 密码（必）
	 */
	private String password;
	/**
	 * 姓名（必）
	 */
	private String name;
	/**
	 * 邮箱
	 */
	private String email;
	
	public User(){}
	public User(String u,String p)
	{
		username=u;
		password=p;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public Serializable key() {
		// TODO Auto-generated method stub
		return username;
	}
	
	
}
