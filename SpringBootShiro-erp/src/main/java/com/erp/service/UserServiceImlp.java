package com.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.mapper.Usersmapper;
import com.erp.pojo.Users;
@Service
public class UserServiceImlp  implements UserService{
	@Autowired
	Usersmapper mapper;

	@Override
	public Users selectUsers(String username) {
		// TODO Auto-generated method stub
		return mapper.selectUsers(username) ;
	}



}
