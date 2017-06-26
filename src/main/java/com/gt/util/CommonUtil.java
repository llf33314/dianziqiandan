package com.gt.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;


/**
 * 获取登录用户信息
 * 
 * @author Administrator
 * 
 */
public class CommonUtil {

	public static String webRealPath;


	@SuppressWarnings("unused")
	private static List<Map<String, Object>> dic = new ArrayList<Map<String, Object>>();

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(
			ApplicationContext applicationContext) {
		CommonUtil.applicationContext = applicationContext;
	}

	/**
	 * 判断对象是否为空
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		boolean b = false;
		try {
			if (obj == null || "".equals(obj)) {
				b = true;
			} else {
				b = false;
			}
		} catch (Exception e) {
			b = false;
			e.printStackTrace();
		}
		return b;
	}

	/**
	 * 转Integer
	 * 
	 * @param obj
	 */
	public static Integer toInteger(Object obj) {
		try {
			if (!isEmpty(obj)) {
				return Integer.parseInt(obj.toString());
			} else {
				throw new Exception("对象为空，转换失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
