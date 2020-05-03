package com.erp.mapper;

import java.util.List;

import com.erp.pojo.AregistrationformYWB;



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
}
