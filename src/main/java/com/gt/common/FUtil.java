/** 
 * <pre>项目名称:springmvc-spring-ibatis-01 
 * 文件名称:FUtil.java 
 * 包名:common.util 
 * 创建日期:2016年12月5日上午11:26:35 
 * Copyright (c) 2016, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/** 
 * <pre>项目名称：springmvc-spring-ibatis-01    
 * 类名称：FUtil    
 * 类描述：    
 * 创建人：陈教授 chenjh123@gmail.com    
 * 创建时间：2016年12月5日 上午11:26:35    
 * 修改人：陈教授 chenjh123@gmail.com     
 * 修改时间：2016年12月5日 上午11:26:35    
 * 修改备注：       
 * @version </pre>    
 */
public class FUtil {

	/**
	 * <pre>uploadFile(原始上传文件的方法)   
	 * 创建人：陈教授 chenjh123@gmail.com    
	 * 创建时间：2016年9月19日 上午11:15:50    
	 * 修改人：陈教授 chenjh123@gmail.com     
	 * 修改时间：2016年9月19日 上午11:15:50    
	 * 修改备注： 
	 * @param realPath：文件保存路径
	 * @param sourceFileName：文件原始名称
	 * @param file：所要上传的文件
	 * @return</pre>
	 */
	public static String uploadFile(String realPath, String sourceFileName, MultipartFile file) {
		//判断，动态创建路径
		File f = new File(realPath);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		//文件重命名（uuid）
		String newFileName = UUID.randomUUID().toString() + sourceFileName.substring(sourceFileName.lastIndexOf("."));
		
		//I/O流保存文件
		InputStream is = null;
		
		OutputStream os = null;
		
		try {
			is = file.getInputStream();
			os = new FileOutputStream(realPath + "/" + newFileName);
			int leng = 2048;
			if (file.getSize() < leng) {
				leng = (int) file.getSize();
			}
			byte[] b = new byte[leng];
			int i = is.read(b);
			while (-1 != i) {
				os.write(b);
				os.flush();
				i = is.read(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return newFileName;
	} 
	
	
	/**
	 * <pre>uploadFile(common.io提供的上传文件方法)   
	 * 创建人：陈教授 chenjh123@gmail.com    
	 * 创建时间：2016年9月19日 上午11:18:33    
	 * 修改人：陈教授 chenjh123@gmail.com     
	 * 修改时间：2016年9月19日 上午11:18:33    
	 * 修改备注： 
	 * @param file：索要保存的文件
	 * @param realPath：文件保存的路径
	 * @param sourceFileName：原始文件名称
	 * @return</pre>
	 */
	public static String uploadFile(MultipartFile file, String realPath, String sourceFileName) {
		//判断，动态创建路径
		File f = new File(realPath);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		//文件重命名（uuid）
		String newFileName = UUID.randomUUID().toString() + sourceFileName.substring(sourceFileName.lastIndexOf("."));
		
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath + "/" + newFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newFileName;
	}
	
	/**
	 * <pre>uploadFile(springmvc自带的上传文件工具类，效率最高)   
	 * 创建人：陈教授 chenjh123@gmail.com    
	 * 创建时间：2016年9月19日 上午11:22:46    
	 * 修改人：陈教授 chenjh123@gmail.com     
	 * 修改时间：2016年9月19日 上午11:22:46    
	 * 修改备注： 
	 * @param realPath：文件保存路径
	 * @param file：索要上传的群文件
	 * @param sourceFileName：原始文件名称
	 * @return</pre>
	 */
	public static String uploadFile(String realPath, MultipartFile file, String sourceFileName) {
		//判断，动态创建路径
		File f = new File(realPath);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		//文件重命名（uuid）
		String newFileName = UUID.randomUUID().toString() + sourceFileName.substring(sourceFileName.lastIndexOf("."));
		
		try {
			file.transferTo(new File(realPath + "/" + newFileName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newFileName;
	}
}
