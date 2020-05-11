package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.AregistrationformYWB;
import com.erp.pojo.Permission;
import com.erp.service.YwbdeletService;

@Controller
public class YwbControoler {
	@Autowired
	 YwbdeletService service;
	
	@RequestMapping("ywb")
	@ResponseBody
	public int deletea(int productID) 
	{
		return service.deleteAreg(productID);
	}

	
	@RequestMapping("ccc")
	@ResponseBody
	public List<AregistrationformYWB> ccc(){
		return service.ccc();
	}
}
