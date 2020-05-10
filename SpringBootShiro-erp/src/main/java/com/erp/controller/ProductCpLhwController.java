package com.erp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erp.pojo.AregistrationformYWB;import com.erp.pojo.CategoryYWB;
import com.erp.pojo.Gradelevel;
import com.erp.pojo.ProductmanagerYWB;
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
	//等待审核
	@RequestMapping("/Selectzbsh")
	@ResponseBody
	public List<AregistrationformYWB> Selectzbsh(){
		String toexamine="等待审核";
		List<AregistrationformYWB> list = service.Selectzbsh(toexamine);
		
		System.out.println("111233");
		return list;
	}
	//查询待审核总数
	@RequestMapping("Selectdshzs")
	@ResponseBody
	public int Selectdshzs(@RequestParam("toexamine")String toexamine) {
		return service.Selectdshzs(toexamine);
		
	}
	//查询通过审核总数
	@RequestMapping("Selecttgshzs")
	@ResponseBody
public int Selecttgshzs(@RequestParam("toexamine")String toexamine) {
	return service.Selectdshzs(toexamine);
	}
	//档案审核
	@RequestMapping("dangansh")
	@ResponseBody
	public String dangansh(@RequestBody AregistrationformYWB areform ) {
		return service.dangansh(areform)>0?"成功":"失败";	
	}
	//查询显示的信息为通过复核的产品档案
	@RequestMapping("/Selectcx")
	@ResponseBody
	public List<AregistrationformYWB> Selectcx(){
		List<AregistrationformYWB> list=service.Selectcx("审核通过");
		return list;
	}
	//产品档案查询
	@RequestMapping("/Selectform")
	@ResponseBody
	public List<AregistrationformYWB> Selectform(){
		List<AregistrationformYWB> list=service.Selectform();
		return list;
	}
}
