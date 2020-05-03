package com.erp.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.erp.pojo.Users;
import com.erp.service.UserService;

public class UserRealm extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    System.out.println("执行授权逻辑");
		
		//给资源进行授权
		SimpleAuthorizationInfo  info=new SimpleAuthorizationInfo();
		
		//添加资源授权字符串   filterMap.put("/add", "perms[user:add]");
		//到数据库查询当前登录用户授权字符串
		//获取当前登录用户
		//Subject subject=SecurityUtils.getSubject();
		//Users user=(Users) subject.getPrincipal();
		//Users dbuser=userService.selectUsersid(user.getId());
		
		//info.addStringPermission(dbuser.getPerms());
		return null;
	}

	//注入业务
	@Autowired
	private UserService userService;
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
	System.out.println("执行认证逻辑");
		
		//编写shiro判断逻辑，判断用户名和密码
			//1：判断用户名
			UsernamePasswordToken token=(UsernamePasswordToken)arg0;
			Users user=userService.selectUsers(token.getUsername());
			if(user==null) {
				//用户名不存在
				return null;//shiro底层会抛出UnknownAccountException
			}
			//2：判断密码
			return new SimpleAuthenticationInfo("",user.getPASSWORD(),"");
	}

}
