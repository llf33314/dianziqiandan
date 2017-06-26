/** 
 * <pre>项目名称:electron 
 * 文件名称:RegisterServiceImpl.java 
 * 包名:com.gt.service.register.impl 
 * 创建日期:2017年5月26日上午9:05:46 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.service.register.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.mapper.TRegisterMapper;
import com.gt.pojo.TRegister;
import com.gt.service.register.RegisterService;

/** 
 * <pre>项目名称：electron    
 * 类名称：RegisterServiceImpl    
 * 类描述：    
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月26日 上午9:05:46    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月26日 上午9:05:46    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	public TRegisterMapper tRegisterMapper;
	
	/* 
	 * 登录验证
	 */
	@Override
	public Map<String, Object> selectLogin(HttpServletRequest request,TRegister tRegister) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userInfo", null);
		HttpSession session = request.getSession();
		//根据用户账号到数据库查询用户信息
		TRegister  nm = tRegisterMapper.selectLogin(tRegister);
		if (null != nm) {
			//判断用户名与密码
			if (null != nm.gettAccount() 
					&& nm.gettAccount().equals(tRegister.gettAccount()) 
					&& null != nm.gettPassword() 
					&& nm.gettPassword().equals(tRegister.gettPassword())) {
				//登陆成功
				map.put("userInfo", nm);
				session.setAttribute("TRegister", nm);
			}
		}
		return map;
	}
}
