package com.erp.mapper;

import java.util.List;

import com.erp.pojo.AregistrationformYWB;

public interface YwbdeleteMapper {
	//永久删除产品
	int deleteAreg(int productID);

	//查询字段
	public List<AregistrationformYWB> ccc();
}
