package com.bankonet.servlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jboss.resteasy.spi.HttpRequest;

import com.bankonet.model.Client;
import com.bankonet.model.CompteEpargne;

@WebServlet("/DetailCompteEpargne")
public class DetailCompteEpargneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int CompteID= Integer.parseInt(request.getParameter("CompteId"));
	
		System.out.println("compteID "+CompteID);
		
		HttpSession session = request.getSession(false);
		Client client = (Client) session.getAttribute("client");
		
		Iterator ceIt = client.getCompteEpargneList().iterator();
		
			while (ceIt.hasNext())
			{
				CompteEpargne tempcompte = (CompteEpargne) ceIt.next();
				System.out.println(tempcompte.getIdentifiant());
					if(tempcompte.getIdentifiant()==CompteID)
					{
						session.setAttribute("compte", tempcompte);
						break;
					}
			}
			
		System.out.println("Compte : "+(CompteEpargne)session.getAttribute("Compte"));
			
		response.sendRedirect(request.getContextPath()+"/detailCompteEpargne.jsp");
	}

}
