package com.erp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.Permission;
import com.erp.service.PermissionService;

@Controller
public class PermissionController {
	@Autowired
	PermissionService service;
	
	@RequestMapping("/selectPermission")
	@ResponseBody
	public List<Permission> selectPermission(HttpSession session){
		String username=(String)session.getAttribute("username");
		System.out.println(username);
		List<Permission> list=service.selectPermission(username);
		for (Permission permission : list) {
			System.out.println(permission);
		}
		return list;
		}

}
