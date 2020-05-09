package com.erp.mapper;

import java.util.List;

import com.erp.pojo.AregistrationformYWB;
import com.erp.pojo.CategoryYWB;
import com.erp.pojo.Gradelevel;
import com.erp.pojo.ProductmanagerYWB;
import com.erp.pojo.Users;



public interface ProductCpLhwmapper {
 

/**
    * 产品档案
    */
	
	//产品档案添加
	int ProductAdd(AregistrationformYWB formadd);
	//产品档案审核
	int dangansh(AregistrationformYWB areform);
	//产品档案查询
	List<AregistrationformYWB> Selectform();
	
	//产品类别查询
	List<CategoryYWB> Selectcplb();
	//产品档次级别查询
    List<Gradelevel> Selectdcjb();
	//产品经理
	List<ProductmanagerYWB> Selectcpjl();
	//查询产品名称是否重复
	int SelectProductname(AregistrationformYWB aname);
	//产品档案等待审核显示
	List<AregistrationformYWB> Selectzbsh(String toexamine);
	//查询待审核总数
	int Selectdshzs(String toexamine);
	//查询通过审核总数
	int Selecttgshzs(String toexamine);
	//查询审核通过的的产品档案信息
	List<AregistrationformYWB> Selectcx(String toexamine);
}
