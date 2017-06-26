/** 
  * <pre>项目名称:electron 
 * 文件名称:RegisterController.java 
 * 包名:com.gt.controller.register 
 * 创建日期:2017年5月26日上午9:02:38 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.controller.register;


import java.util.HashMap;
import java.util.Map;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.gt.pojo.TRegister;
import com.gt.service.register.RegisterService;


/** 
 * <pre>项目名称：electron    
 * 类名称：RegisterController    
 * 类描述：    
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月26日 上午9:02:38    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月26日 上午9:02:38    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/registerController")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	/**
	 * <pre>selectLogin(登录验证)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年5月26日 上午11:16:18    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年5月26日 上午11:16:18    
	 * 修改备注： 
	 * @param tRegister
	 * @return</pre>
	 */
	@RequestMapping("/selectLogin")
	public void selectLogin(HttpServletRequest request,TRegister tRegister, HttpServletResponse response){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			if (null != tRegister.gettAccount() 
					&& null != tRegister.gettPassword()) {
				modelMap = registerService.selectLogin(request,tRegister);
			}
			if (null == modelMap.get("userInfo")) {
				//用户名或密码错误
				modelMap.put("userInfo",1);
			} else {
				//登录成功
				modelMap.put("userInfo",9);
			}
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", "成功");
			response.getWriter().write(JSONObject.toJSONString(modelMap));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * <pre>skipList(成功跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月12日 下午4:42:35    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月12日 下午4:42:35    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("skipList")
	public ModelAndView skipList(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("electronicTicket/list");
		return mav;
	}
}
