package com.erp.mapper;

import com.erp.pojo.Users;

public interface Usersmapper {
	//查询用户
	public Users  selectUsers(String username);

}
