package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.Permissionmapper;
import com.erp.pojo.Permission;
@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	Permissionmapper mapper;
	@Override
	public List<Permission> selectPermission(String username) {
		// TODO Auto-generated method stub
		return mapper.selectPermission(username);
	}

}
