/** 
 * <pre>项目名称:electron 
 * 文件名称:ElectronController.java 
 * 包名:com.gt.controller.electron 
 * 创建日期:2017年5月22日下午2:41:46 
 * Copyright (c) 2017, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.controller.electron;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.gt.common.FileUtil;
import com.gt.pojo.TElectronMain;
import com.gt.pojo.TRegister;
import com.gt.service.electron.ElectronService;
import com.gt.util.ImageCut;
import com.gt.util.Page;
import com.gt.util.QRcodeKit;
import com.gt.util.ftp.ContinueFTP;



/** 
 * <pre>项目名称：electron    
 * 类名称：ElectronController    
 * 类描述：    电子受理单
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2017年5月22日 下午2:41:46    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2017年5月22日 下午2:41:46    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/electronController")
public class ElectronController {
	
	@Autowired
	public ElectronService electronService;
	
	@Value("#{config['res.image.path']}")
	private String imagePath; // 图片的存放路径
	
	@Value("#{config['resource.url.prefix']}")
	private String resourceurl;
	
	@Value("#{config['resource.url.locality']}")
	private String locality;  //本地路径
	
	
	
	
	/**
	 * <pre>selectElectronList(查询 电子受理单)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年5月22日 下午2:49:08    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年5月22日 下午2:49:08    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/selectElectronList")
	@ResponseBody
	public Map<String, Object> selectElectronList(TRegister tRegister,HttpServletRequest request, @RequestParam Map<String, Object> params){
		Map<String, Object> modelMap = new HashMap<String,Object>();
		TRegister eegister = new TRegister();
		params.put("tDelete", 1);
		if (null != request.getSession().getAttribute("TRegister")) {
			eegister = (TRegister) request.getSession().getAttribute("TRegister");
		}
		params.put("tRegisterId", eegister.gettId());
		Page page = electronService.PageList(params);
		modelMap.put("page", page);
		modelMap.put("resourceurl",resourceurl);
		modelMap.put("success", 9);
		return modelMap;  
	}
	
	/**
	 * <pre>insertSkip(添加跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月12日 上午9:08:48    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月12日 上午9:08:48    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/insertSkip")
	public ModelAndView insertSkip(){
		ModelAndView mav = new ModelAndView();
		//添加页面
		mav.setViewName("electronicTicket/edit");
		return mav;
	}
	
	/**
	 * <pre>insertElectron(添加 电子受理单信息)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年5月22日 下午2:53:26    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年5月22日 下午2:53:26    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/insertElectron")
	@ResponseBody
	public String insertElectron(TElectronMain electron,HttpServletRequest request){
		TRegister eegister = new TRegister();
		if (null != request.getSession().getAttribute("TRegister")) {
			eegister = (TRegister) request.getSession().getAttribute("TRegister");
		}
		electron.settRegisterId(eegister.gettId());
		electronService.insertElectron(electron);
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", 9);
		String jsonString = JSONObject.toJSONString(modelMap);
		return jsonString;
	}
	
	/**
	 * <pre>selectElectronListBYid(通过ID查询一条电子受理单信息)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 上午8:19:08    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 上午8:19:08    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/{busId}/selectElectronListBYid.do")
	@ResponseBody
	public String selectElectronListBYid(TElectronMain electron,HttpServletResponse response ,@PathVariable Integer busId){
		Map<String, Object> modelMap = new HashMap<String,Object>();
		electron.settId(busId);
		TElectronMain electronList = electronService.selectElectronListBYid(electron);
		if (electronList.gettIdentityCard() != null ) {
			modelMap.put("electronList", electronList.gettIdentityCard());
		}
		if (electronList.gettBusiness() != null ) {
			electronList.settBusiness(electronList.gettBusiness());
		}
		if (electronList.gettSign() != null ) {
			electronList.settSign(electronList.gettSign());
		}
		if (electronList.gettIdentityCard2() != null ) {
			electronList.settSign(electronList.gettIdentityCard2());
		}
		modelMap.put("electronList",electronList);
		String jsonString = JSONObject.toJSONString(modelMap);
		return jsonString;
	}
	
	/**
	 * <pre>updateSkip(修改页面跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月13日 下午2:03:24    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月13日 下午2:03:24    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/updateSkip")
	public ModelAndView updateSkip(){
		ModelAndView mav = new ModelAndView();
		//添加页面
		mav.setViewName("electronicTicket/edit");
		return mav;
	}
	
	/**
	 * <pre>detailsSkip(详情页面跳转)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月13日 下午2:02:22    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月13日 下午2:02:22    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/detailsSkip")
	public ModelAndView detailsSkip(){
		ModelAndView mav = new ModelAndView();
		//添加页面
		mav.setViewName("electronicTicket/details");
		return mav;
	}
	
	/**
	 * <pre>auditPass(审核审批通过)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 下午2:22:48    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 下午2:22:48    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/auditPass.do")
	@ResponseBody
	public Map<String, Object> auditPass(TElectronMain electron){
		Map<String, Object> modelMap = new HashMap<String,Object>();
		electron.settAgreement(9);
		electronService.auditPass(electron);
		modelMap.put("success", 9);
		return modelMap;
	}
	
	/**
	 * <pre>updateElectron(修改 电子受理单信息)
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年5月26日 上午10:52:58    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年5月26日 上午10:52:58    
	 * 修改备注： 
	 * @param electron
	 * @param param
	 * @return</pre>
	 */
	@RequestMapping("/updateElectron")
	@ResponseBody
	public String updateElectron(TElectronMain electron, @RequestParam Map<String, Object> param){
		if (param.get("addImgBase_1") != null ||
				param.get("addImgBase_2") != null ||
					param.get("addImgBase_3") != null ||
						param.get("addImgBase_4") != null) {
			ImageCut imageCut = new ImageCut();
			String path = imagePath+"/electron/";
			ContinueFTP myFtp = new ContinueFTP();
			if (param.get("addImgBase_1") != null) {
				String addImgBase_1 = param.get("addImgBase_1").toString();
				addImgBase_1 = addImgBase_1.substring(addImgBase_1.indexOf(",") + 1, addImgBase_1.length());
				String newFileName1 = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase() + ".jpg";
				boolean flag1 = imageCut.generateImage(addImgBase_1, path, newFileName1);
				if (flag1) {
					try {
					myFtp.upload(new File(path+newFileName1).getPath());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					electron.settIdentityCard((path+newFileName1).split("upload/")[1]);
				}
			}
			if (param.get("addImgBase_4") != null) {
				String addImgBase_4 = param.get("addImgBase_4").toString();
				addImgBase_4 = addImgBase_4.substring(addImgBase_4.indexOf(",") + 1, addImgBase_4.length());
				String newFileName4 = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase() + ".jpg";
				boolean flag4 = imageCut.generateImage(addImgBase_4, path, newFileName4);
				if (flag4) {
					try {
					myFtp.upload(new File(path+newFileName4).getPath());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					electron.settSign((path+newFileName4).split("upload/")[1]);
				}
			}
			if (param.get("addImgBase_2") != null) {
				String addImgBase_2 = param.get("addImgBase_2").toString();
				addImgBase_2 = addImgBase_2.substring(addImgBase_2.indexOf(",") + 1, addImgBase_2.length());
				String newFileName2 = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase() + ".jpg";
				boolean flag2 = imageCut.generateImage(addImgBase_2, path, newFileName2);
				if (flag2) {
					try {
					myFtp.upload(new File(path+newFileName2).getPath());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					electron.settIdentityCard2((path+newFileName2).split("upload/")[1]);
				}
			}
			if (param.get("addImgBase_3") != null) {
				String addImgBase_3 = param.get("addImgBase_3").toString();
				addImgBase_3 = addImgBase_3.substring(addImgBase_3.indexOf(",") + 1, addImgBase_3.length());
				String newFileName3 = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase() + ".jpg";
				boolean flag3 = imageCut.generateImage(addImgBase_3, path, newFileName3);
				if (flag3) {
					try {
					myFtp.upload(new File(path+newFileName3).getPath());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					electron.settBusiness((path+newFileName3).split("upload/")[1]);
				}
			}
			electron.settAgreement(1);
		}
		electronService.updateElectron(electron);
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", 9);
		String jsonString = JSONObject.toJSONString(modelMap);
		return jsonString;
	}
		
	/**
	 * <pre>deleteCompanyByDel(回填图片)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年5月26日 下午2:31:19    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年5月26日 下午2:31:19    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/deletePicture")
	@ResponseBody
	public Map<String, Object> deletePicture(HttpServletRequest request,TElectronMain electron){
		electron = electronService.selectElectronListBYid(electron);
		if (electron.gettBusiness() != null) {
			deleteFile(imagePath+"/"+electron.gettBusiness());
		}
		if (electron.gettIdentityCard() != null ) {
			deleteFile(imagePath+"/"+electron.gettSign());
		}
		if (electron.gettIdentityCard2() != null ) {
			deleteFile(imagePath+"/"+electron.gettSign());
		}
		if (electron.gettSign() != null ) {
			deleteFile(imagePath+"/"+electron.gettSign());
		}
		electron.settAgreement(2);
		electronService.deletePicture(electron);
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", 9);
		return modelMap;
	}
	
	/**
	 * <pre>deleteElectronByDel(删除 电子受理单信息)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 下午4:20:58    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 下午4:20:58    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/deleteElectronByIDl")
	@ResponseBody
	public Map<String, Object> deleteElectronByDel(TElectronMain electron){
		electron.settDelete(2);
		electronService.updateElectronByDel(electron);
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", 9);
		return modelMap;
	}
	
	/**
	 * <pre>getLink(获取链接)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 下午12:05:47    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 下午12:05:47    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/getLink")
	@ResponseBody
	public Map<String, Object> getLink(TElectronMain electron,HttpServletResponse response){
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("url", locality+"/"+"cellphoneController"+"/"+electron.gettId()+"/79B4DE7C/cellphone.do");
		return modelMap;
	}
	
	/**
	 * <pre>getElectronQRcode(获取二维码)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月20日 上午11:40:48    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月20日 上午11:40:48    
	 * 修改备注： 
	 * @param electron
	 * @param response</pre>
	 */
	@RequestMapping("/getElectronQRcode")
	public void getElectronQRcode(TElectronMain electron,HttpServletResponse response) {		
		try {
			QRcodeKit.buildQRcode(locality+"/"+"cellphoneController"+"/"+electron.gettId()+"/79B4DE7C/cellphone.do", 300, 300, response);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	  
	/**
	 * <pre>downLoadFile(下载方法)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 下午9:43:29    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 下午9:43:29    
	 * 修改备注： 
	 * @param electron
	 * @return</pre>
	 */
	@RequestMapping("/downLoadFile")
	@ResponseBody
	public void downLoadFile(@RequestParam Map<String, Object> param,HttpServletResponse response){
		//查询文件信息
		if (param.get("file") != null && !param.get("file").equals("")) {
			String file = param.get("file").toString();
			//获取文件路径
			String string = file.split("upload/")[1];
			if (null != string && !string.equals("")) {
				FileUtil.downLoadFile(imagePath, string, response);
			}
		}
	}

	/**
	 * <pre>deleteFile(删除资源库的图片)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2017年6月6日 下午4:20:04    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2017年6月6日 下午4:20:04    
	 * 修改备注： 
	 * @param fileName
	 * @return</pre>
	 */
	public static boolean deleteFile(String fileName) {
	   File file = new File(fileName);
	   // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
	   if (file.exists() && file.isFile()) {
	        if (file.delete()) {
	            return true;
	        } else {
	            return false;
	        }
	    } else {
	        return false;
	    }
	}


}
