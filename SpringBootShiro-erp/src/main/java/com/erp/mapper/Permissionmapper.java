package com.erp.mapper;

import java.util.List;

import com.erp.pojo.Permission;

public interface Permissionmapper {
	public List<Permission> selectPermission(String username);

}
