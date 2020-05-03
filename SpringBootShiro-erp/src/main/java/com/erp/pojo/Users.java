package com.erp.pojo;

public class Users {

	private int id;//编号
	private String username; //用户名
	private String PASSWORD;//用户密码
	private String perms;//用户地址
	
	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", PASSWORD=" + PASSWORD + ", perms=" + perms + "]";
	}



	public Users(int id, String username, String pASSWORD, String perms) {
		super();
		this.id = id;
		this.username = username;
		PASSWORD = pASSWORD;
		this.perms = perms;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPASSWORD() {
		return PASSWORD;
	}



	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}



	public String getPerms() {
		return perms;
	}



	public void setPerms(String perms) {
		this.perms = perms;
	}



	public Users() {
		super();
	}
	
	
}
