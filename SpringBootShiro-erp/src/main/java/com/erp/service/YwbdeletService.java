package com.erp.service;

import java.util.List;

import com.erp.pojo.AregistrationformYWB;

public interface YwbdeletService {
	//永久删除产品
	int deleteAreg(int productID);
	
	//查询字段
    List<AregistrationformYWB> ccc();

}
