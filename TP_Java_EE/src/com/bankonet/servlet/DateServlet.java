package com.bankonet.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	public void init(ServletConfig conf)
	{
		try {
			super.init(conf);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println( "Initialisation du servlet le "+sdf.format(new Date())) ;
	}
	
	public void destroy ()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println( "suppression du servlet le "+sdf.format(new Date())) ;
	}
	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException 
	{
		System.out.println("redirect vers login.jsp");
//		req.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
		resp.sendRedirect(req.getContextPath()+"/login.jsp");
		
	}

}
