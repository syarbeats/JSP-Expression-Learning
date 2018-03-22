package com.cdc.mitrais.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdc.mitrais.model.SalesBean;


/**
 * Servlet implementation class Conditionals
 */
@WebServlet("/conditionals")
public class Conditionals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Conditionals() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SalesBean apples = new SalesBean(150.25, -75.25, 22.25, -33.57);
		SalesBean oranges = new SalesBean(-220.25, -49.57, 138.25, 12.25);
		request.setAttribute("apples", apples);
		request.setAttribute("oranges", oranges);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/conditionals.jsp");
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
