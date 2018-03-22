package com.cdc.mitrais.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Collections
 */
@WebServlet("/collections")
public class Collections extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Collections() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] firstNames = {"Bill", "Scott", "Larry"};
		List<String> lastNames = new ArrayList<String>();
		lastNames.add("Ellison");
		lastNames.add("Gates");
		lastNames.add("McNealy");
		
		Map<String, String> companyNames = new HashMap<String, String>();
		companyNames.put("Ellison", "Sun");
		companyNames.put("Gates", "Oracle");
		companyNames.put("McNealy", "Microsoft");
		
		request.setAttribute("first", firstNames);
		request.setAttribute("last", lastNames);
		request.setAttribute("company", companyNames);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/collections.jsp");
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
