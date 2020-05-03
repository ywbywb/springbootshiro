package com.erp.service;

import java.util.List;

import com.erp.pojo.Permission;

public interface PermissionService {

	public List<Permission> selectPermission(String username);
}
