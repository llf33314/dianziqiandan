/** 
 * <pre>项目名称:electron 
 * 文件名称:CellphoneController.java 
 * 包名:com.gt.controller.electron.cellphone 
 * 创建日期:2017年6月13日上午10:50:53 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.controller.electron.cellphone;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gt.pojo.TElectronMain;
import com.gt.service.electron.ElectronService;

/** 
 * <pre>项目名称：electron    
 * 类名称：CellphoneController    
 * 类描述：    
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年6月13日 上午10:50:53    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年6月13日 上午10:50:53    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/cellphoneController")
public class CellphoneController {
	
	@Autowired
	public ElectronService electronService;
	
	@Value("#{config['resource.url.prefix']}")
	private String resourceurl;
	
	
	/**
	 * <pre>cellphone(手机端)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月12日 下午4:56:13    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月12日 下午4:56:13    
	 * 修改备注： 
	 * @param electron
	 * @param request
	 * @param busId
	 * @return</pre>
	 */
	@RequestMapping("/{busId}/79B4DE7C/cellphone.do")
	public ModelAndView cellphone(TElectronMain electron,HttpServletRequest request,@PathVariable Integer busId){
		ModelAndView mav = new ModelAndView();
		electron.settId(busId);
		TElectronMain electronList = electronService.selectElectronListBYid(electron);
		if (electronList.gettAgreement() == 2) {
			mav.addObject("electronList", electronList);
			mav.setViewName("phone/index");
		}else {
			//修改页面
			mav.setViewName("phone/success");
		}
		return mav;
	}
	
	/**
	 * <pre>succeedSkip(成功页面跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月13日 下午2:19:17    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月13日 下午2:19:17    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/79B4DE7C/succeedSkip")
	public ModelAndView succeedSkip(){
		ModelAndView mav = new ModelAndView();
		//添加页面
		mav.setViewName("phone/success");
		return mav;
	}
	
	/**
	 * <pre>agreementSkip(协议信息跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月13日 下午2:21:15    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月13日 下午2:21:15    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/79B4DE7C/agreementSkip")
	public ModelAndView agreementSkip(){
		ModelAndView mav = new ModelAndView();
		//添加页面
		mav.setViewName("phone/article");
		return mav;
	}
}
