/** 
 * <pre>项目名称:electron 
 * 文件名称:RegisterService.java 
 * 包名:com.gt.service.register 
 * 创建日期:2017年5月26日上午9:04:44 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.service.register;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.gt.pojo.TRegister;

/** 
 * <pre>项目名称：electron    
 * 类名称：RegisterService    
 * 类描述：    
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月26日 上午9:04:44    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月26日 上午9:04:44    
 * 修改备注：       
 * @version </pre>    
 */
public interface RegisterService {

	Map<String, Object> selectLogin(HttpServletRequest request,TRegister tRegister);

}
