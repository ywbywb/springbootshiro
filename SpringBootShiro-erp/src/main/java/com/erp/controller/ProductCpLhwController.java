package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.AregistrationformYWB;import com.erp.pojo.CategoryYWB;
import com.erp.pojo.Gradelevel;
import com.erp.pojo.ProductmanagerYWB;
import com.erp.pojo.Users;
import com.erp.service.ProductCpLhwService;

@Controller
public class ProductCpLhwController {

	@Autowired
	ProductCpLhwService service;
	
	//产品档案添加
	@RequestMapping("/ProductAdd")
	@ResponseBody
	public String ProductAdd(@RequestBody AregistrationformYWB formadd) {
		int lhw=service.ProductAdd(formadd);
		System.out.println(formadd.getProductname());
		System.out.println(formadd.getMarketvalue());
		return lhw>0?"成功":"失败";
	}
	
	//产品类别查询
	@RequestMapping("/Selectcplb")
	@ResponseBody
	public List<CategoryYWB> Selectcplb(){
		return service.Selectcplb();
	}
	
	//产品档次级
    @RequestMapping("/Selectdcjb")
    @ResponseBody
    public List<Gradelevel> Selectdcjb(){
    	
		return service.Selectdcjb();
    }
    
	//产品经理
	@RequestMapping("/Selectcpjl")
	@ResponseBody
	public List<ProductmanagerYWB> Selectcpjl(){
		return service.Selectcpjl();
	}
	
	//查询名称是否重复
	@RequestMapping("/SelectProductname")
	@ResponseBody
	public int SelectProductname(@RequestBody AregistrationformYWB aname) {
		System.out.println(aname.getProductname());
		System.out.println("刘海文");
		int row=service.SelectProductname(aname);
		return row;
	}
}
