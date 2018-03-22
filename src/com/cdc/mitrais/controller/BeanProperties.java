package com.cdc.mitrais.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdc.mitrais.model.Company;
import com.cdc.mitrais.model.Employee;
import com.cdc.mitrais.model.Name;

/**
 * Servlet implementation class BeanProperties
 */
@WebServlet("/bean-properties")
public class BeanProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanProperties() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Name name = new Name("Marty", "Hall");
		Company company = new Company("coreservlets.com", "Customized Java EE and Ajax Training");
		Employee employee = new Employee(name, company);
		
		request.setAttribute("employee", employee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/bean-properties.jsp");
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
