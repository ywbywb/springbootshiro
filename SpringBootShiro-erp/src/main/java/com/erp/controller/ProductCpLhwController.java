package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.AregistrationformYWB;import com.erp.pojo.CategoryYWB;
import com.erp.pojo.GradelevelYWB;
import com.erp.pojo.ProductmanagerYWB;
import com.erp.service.ProductCpLhwService;

@Controller
public class ProductCpLhwController {

	@Autowired
	ProductCpLhwService service;
	
	//产品档案添加
	@RequestMapping("/ProductAdd")
	@ResponseBody
	public String ProductAdd(AregistrationformYWB formadd) {
		int lhw=service.ProductAdd(formadd);
		return lhw>0?"成功":"失败";
	}
	//产品类别查询
	@RequestMapping("/Selectcplb")
	@ResponseBody
	public List<CategoryYWB> Selectcplb(){
		return service.Selectcplb();
	}
	//产品档次级别
    @RequestMapping("/Selectdcjb")
    @ResponseBody
    public List<GradelevelYWB> Selectdcjb(){
		return service.Selectdcjb();
    }
	//产品经理
	@RequestMapping("/Selectcpjl")
	@ResponseBody
	public List<ProductmanagerYWB> Selectcpjl(){
		return service.Selectcpjl();
	}
}
