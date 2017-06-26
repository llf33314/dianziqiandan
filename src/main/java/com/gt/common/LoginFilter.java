/**
 * @Description:
 * @author: wythelee
 * @date: 2015年7月27日 上午10:28:57
 */
package com.gt.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gt.util.CommonUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginFilter implements Filter {
	
	
	//不需要登录就可访问的url
	public static final Map<String, String> urls=new HashMap<String, String>();

	//可通过的文件类型
	public static final List<String> suffixs=new ArrayList<String>();
	
	
	static{
		urls.put("/electronController/updateElectron.do", "/electronController/updateElectron.do");
		urls.put("/registerController/selectLogin.do", "/registerController/selectLogin.do");
		urls.put("/jsp/login/login.jsp", "/jsp/login/login.jsp");
		
		
		suffixs.add("js");
		suffixs.add("css");
		suffixs.add("gif");
		suffixs.add("png");
		suffixs.add("jpg");
		suffixs.add("ico");
		suffixs.add("html");
		suffixs.add("dwr");
		suffixs.add("mp3");
		suffixs.add("txt");
	}
	
	
	/* (non-Javadoc)    
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)    
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse ServletResponse = (HttpServletResponse) response;
		//获取路径
		String url = servletRequest.getRequestURI();
		String urlwx="";
		if(url.length()>0){
			//截取URL中的倒数第一个/和第二个/之间的数值
			String tmp = url.substring(0,url.lastIndexOf("/"));
			urlwx = tmp.substring(tmp.lastIndexOf("/")+1, tmp.length());
		}
		Object obj=servletRequest.getSession().getAttribute("userInfo");
		if (!CommonUtil.isEmpty(obj) || passUrl(url) || passSuffixs(url) || urlwx.equals("79B4DE7C")) {
			chain.doFilter(request, response);
		}else {
			ServletResponse.sendRedirect("/jsp/login/login.jsp");
		}
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	//判断是否是可通过的url
	private boolean passUrl(String url){
		return urls.containsKey(url);
	}
	
	@SuppressWarnings("unused")
	private boolean passSuffixs(String url){
		boolean reuslt=false;
		for (int i = 0; i < suffixs.size(); i++) {
			if(url.endsWith(suffixs.get(i))){
				reuslt=true;
				break;
			}
		}
		return reuslt;
	}
	
}
