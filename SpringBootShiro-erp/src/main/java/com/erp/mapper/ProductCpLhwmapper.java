package com.erp.mapper;

import java.util.List;

import com.erp.pojo.AregistrationformYWB;
import com.erp.pojo.CategoryYWB;
import com.erp.pojo.GradelevelYWB;
import com.erp.pojo.ProductmanagerYWB;



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
   List<GradelevelYWB> Selectdcjb();
	//产品经理
	List<ProductmanagerYWB> Selectcpjl();
}
