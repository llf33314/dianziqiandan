package com.gt.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 
 * <pre>项目名称：book-01    
 * 类名称：UrlUtil    
 * 类描述：    
 * 创建人：王博 1048595679@qq.com  
 * 创建时间：2016年7月9日 下午5:47:07    
 * 修改人：王博 z1048595679@qq.com     
 * 修改时间：2016年7月9日 下午5:47:07    
 * 修改备注：       
 * @version </pre>
 */
public class UrlUtil {

	/**
	 * <pre>encode(url编码)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2016年7月9日 下午5:46:52    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2016年7月9日 下午5:46:52    
	 * 修改备注： 
	 * @param sourceName
	 * @return</pre>
	 */
	public static String encode(String sourceName) {
		try {
			sourceName = URLEncoder.encode(sourceName, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sourceName;
	}
	
	/**
	 * <pre>decode(url解码)   
	 * 创建人：王博 1048595679@qq.com    
	 * 创建时间：2016年7月9日 下午5:46:41    
	 * 修改人：王博 1048595679@qq.com      
	 * 修改时间：2016年7月9日 下午5:46:41    
	 * 修改备注： 
	 * @param sourceName
	 * @return</pre>
	 */
	public static String decode(String sourceName) {
		try {
			sourceName = URLDecoder.decode(sourceName, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sourceName;
	}
}
