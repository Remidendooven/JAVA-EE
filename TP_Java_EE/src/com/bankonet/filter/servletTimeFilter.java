package com.bankonet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


public class servletTimeFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		long timeIn = System.currentTimeMillis();
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println(((HttpServletRequest) request).getRequestURL());
		long timeOut = System.currentTimeMillis();
		System.out.println("durée de traitement : "+(timeOut-timeIn)+"ms");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
	