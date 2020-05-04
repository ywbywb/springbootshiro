package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.ProductCpLhwmapper;
import com.erp.pojo.AregistrationformYWB;
import com.erp.pojo.CategoryYWB;
import com.erp.pojo.GradelevelYWB;
import com.erp.pojo.ProductmanagerYWB;
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
		return mapper.dangansh(areform);
	}

	@Override
	public List<AregistrationformYWB> Selectform() {
		// TODO Auto-generated method stub
		return mapper.Selectform();
	}

	@Override
	public List<CategoryYWB> Selectcplb() {
		// TODO Auto-generated method stub
		return mapper.Selectcplb();
	}



	@Override
	public List<ProductmanagerYWB> Selectcpjl() {
		// TODO Auto-generated method stub
		return mapper.Selectcpjl();
	}

	@Override
	public List<GradelevelYWB> Selectdcjb() {
		// TODO Auto-generated method stub
		return mapper.Selectdcjb();
	}

	



}
