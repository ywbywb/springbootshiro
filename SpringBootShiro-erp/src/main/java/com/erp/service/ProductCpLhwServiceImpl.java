package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.ProductCpLhwmapper;
import com.erp.pojo.AregistrationformYWB;
@Transactional
@Service
public class ProductCpLhwServiceImpl implements ProductCpLhwService{

	@Autowired
	ProductCpLhwmapper mapper;
	
	@Override
	public int ProductAdd(AregistrationformYWB formadd) {
		// TODO Auto-generated method stub
		return mapper.ProductAdd(formadd);
	}

	@Override
	public int dangansh(AregistrationformYWB areform) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AregistrationformYWB> Selectform() {
		// TODO Auto-generated method stub
		return null;
	}

}
