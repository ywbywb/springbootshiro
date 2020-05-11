package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.YwbdeleteMapper;
import com.erp.pojo.AregistrationformYWB;
@Transactional
@Service
public class YwbdeletServiceImpl implements YwbdeletService{
	@Autowired
	YwbdeleteMapper mapper;
	//永久删除产品
	@Override
	public int deleteAreg(int productID) {
		// TODO Auto-generated method stub
		return mapper.deleteAreg(productID);
	}
	@Override
	public List<AregistrationformYWB> ccc() {
		// TODO Auto-generated method stub
		return mapper.ccc();
	}

}
