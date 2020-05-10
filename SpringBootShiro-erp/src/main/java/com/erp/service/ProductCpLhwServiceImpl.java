package com.erp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.mapper.ProductCpLhwmapper;
import com.erp.pojo.AregistrationformYWB;
import com.erp.pojo.CategoryYWB;
import com.erp.pojo.Gradelevel;
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
	public List<Gradelevel> Selectdcjb() {
		// TODO Auto-generated method stub
		return mapper.Selectdcjb();
	}

	@Override
	public int SelectProductname(AregistrationformYWB aname) {
		// TODO Auto-generated method stub
		return mapper.SelectProductname(aname);
	}

	@Override
	public List<AregistrationformYWB> Selectzbsh(@Param("toexamine")String toexamine) {
		// TODO Auto-generated method stub
		return mapper.Selectzbsh(toexamine);
	}

	@Override
	public int Selectdshzs(@Param("toexamine")String toexamine) {
		// TODO Auto-generated method stub
		return mapper.Selectdshzs(toexamine);
	}

	@Override
	public int Selecttgshzs(@Param("toexamine")String toexamine) {
		// TODO Auto-generated method stub
		return mapper.Selectdshzs(toexamine);
	}

	@Override
	public List<AregistrationformYWB> Selectcx(String toexamine) {
		// TODO Auto-generated method stub
		return mapper.Selectcx(toexamine);
	}


	

	



}
