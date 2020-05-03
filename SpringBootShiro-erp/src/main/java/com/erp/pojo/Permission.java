package com.erp.pojo;

public class Permission {
	private int id;
	private String f_ModuleId;
	private String f_ParentId;
	private String f_FullName;
	private String f_UrlAddress;
	private int typee;
	public Permission() {
		super();
	}
	public Permission(int id, String f_ModuleId, String f_ParentId, String f_FullName, String f_UrlAddress, int typee) {
		super();
		this.id = id;
		this.f_ModuleId = f_ModuleId;
		this.f_ParentId = f_ParentId;
		this.f_FullName = f_FullName;
		this.f_UrlAddress = f_UrlAddress;
		this.typee = typee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_ModuleId() {
		return f_ModuleId;
	}
	public void setF_ModuleId(String f_ModuleId) {
		this.f_ModuleId = f_ModuleId;
	}
	public String getF_ParentId() {
		return f_ParentId;
	}
	public void setF_ParentId(String f_ParentId) {
		this.f_ParentId = f_ParentId;
	}
	public String getF_FullName() {
		return f_FullName;
	}
	public void setF_FullName(String f_FullName) {
		this.f_FullName = f_FullName;
	}
	public String getF_UrlAddress() {
		return f_UrlAddress;
	}
	public void setF_UrlAddress(String f_UrlAddress) {
		this.f_UrlAddress = f_UrlAddress;
	}
	public int getTypee() {
		return typee;
	}
	public void setTypee(int typee) {
		this.typee = typee;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", f_ModuleId=" + f_ModuleId + ", f_ParentId=" + f_ParentId + ", f_FullName="
				+ f_FullName + ", f_UrlAddress=" + f_UrlAddress + ", typee=" + typee + "]";
	}

	
}
