/** 
 * <pre>项目名称:ssh2-books-01 
 * 文件名称:FileUtil.java 
 * 包名:com.jk.util 
 * 创建日期:2016年7月8日上午6:15:21 
 * Copyright (c) 2016, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.gt.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/** 
 * <pre>项目名称：ssh2-books-01    
 * 类名称：FileUtil    
 * 类描述：    
 * 创建人：陈教授 chenjh123@gmail.com    
 * 创建时间：2016年7月8日 上午6:15:21    
 * 修改人：陈教授 chenjh123@gmail.com     
 * 修改时间：2016年7月8日 上午6:15:21    
 * 修改备注：       
 * @version </pre>    
 */
public class FileUtil {

	/**
	 * <pre>uploadFile(文件上传)   
	 * 修改备注： 
	 * @param fileName
	 * 			真实文件名称
	 * @param path
	 * 			文件保存路径
	 * @param file
	 * 			所要保存的文件
	 * @return
	 * 			生成的新的文件名(uuid+后缀名)
	 * </pre>
	 */
	public static String uploadFile(String fileName, String path, File file) {
		//截取文件后缀名
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		//生成新的文件名
		String newFileName = UUID.randomUUID().toString() + suffix;
		//判断该路径是否存在，不存在就创建
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
		
		//声明I/O流
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(path + "/" + newFileName);
			byte[] b = new byte[2048];
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
	 * <pre>downLoadFile(文件下载)   
	 * 修改备注： 
	 * @param path
	 * @param fileName
	 * @param response</pre>
	 */
	public static void downLoadFile(String path, String fileName, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + UrlUtil.encode(fileName));
		response.setHeader("Content-Type", "application/octet-stream");
		
		//声明I/O流
		InputStream is = null;
		OutputStream os = null;
		try {
			String file = path+"/"+fileName;
			is = new FileInputStream(file);
			os = response.getOutputStream();
			byte[] b = new byte[2048];
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
	}
	
	/**
	 * <pre>downLoadFile(文件下载)   
	 * 修改备注： 
	 * @param path
	 * @param fileName
	 * @param response</pre>
	 */
	public static void exportExcelFile(HSSFWorkbook wb, String fileName, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + UrlUtil.encode(fileName));
		response.setHeader("Content-Type", "application/vnd.ms-excel");
		
		//声明I/O流
		OutputStream os = null;
		try {
			os = response.getOutputStream();
			wb.write(os);
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
		}
	}
	
	
}
