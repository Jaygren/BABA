package com.BABA.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class BabaStruts2Filter extends StrutsPrepareAndExecuteFilter{
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException, IOException
{
	HttpServletRequest request=(HttpServletRequest)req;
	String url=request.getRequestURI();
	//System.out.println(url);
	if(url.contains("controller.jsp")){
		//System.out.println("使用自定义过滤器");
		chain.doFilter(req, res);
	}else{
		//System.out.println("使用默认过滤器");
		super.doFilter(req, res, chain);
	}
	}
}
