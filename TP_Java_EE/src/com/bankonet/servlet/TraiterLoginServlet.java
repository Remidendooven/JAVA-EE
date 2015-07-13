package com.bankonet.servlet;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankonet.model.BankonetException;
import com.bankonet.model.Client;
import com.bankonet.service.BanqueService;
import com.bankonet.service.BanqueServiceManager;


@WebServlet("/traiterLogin")
public class TraiterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String identifiant = (String) request.getParameter("login");
		String motDePasse = (String) request.getParameter("motDePasse");
		
		BanqueService banqueService = BanqueServiceManager.getBanqueService();
		
		try {
			Client c = banqueService.findClient(identifiant, motDePasse);
			
				HttpSession session = request.getSession(true);
				session.setAttribute("client", c);
				response.sendRedirect(request.getContextPath()+"/pagePrincipale.jsp");
				
		} catch (BankonetException e) {
			response.sendRedirect(request.getContextPath()+"/erreur.jsp");
			System.out.println("connection impossible");
			
		}
		
	}

}
