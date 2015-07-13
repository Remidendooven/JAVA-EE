package com.bankonet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class InitVirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		
		if (session != null)
		{
			RequestDispatcher disp = this.getServletContext().getRequestDispatcher("/virement.jsp");
			disp.forward(request, response);
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

}
