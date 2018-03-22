package com.cdc.mitrais.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopedVars
 */
@WebServlet("/ScopedVars")
public class ScopedVars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopedVars() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("attribute1", "First Value");
		HttpSession session = request.getSession();
		session.setAttribute("attribute2", "Second Value");
		
		ServletContext application = getServletContext();
		application.setAttribute("attribute3", new java.util.Date());
		
		request.setAttribute("repeated", "Request");
		session.setAttribute("repeated", "Session");
		application.setAttribute("repeated", "ServletContext");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/scoped-vars.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
