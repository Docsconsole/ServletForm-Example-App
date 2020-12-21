package com.docsconsole.servlet4.tutorials;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Hello World");		
		System.out.println("firstname"+request.getParameter("firstname"));
		System.out.println("lastname"+request.getParameter("lastname"));
		System.out.println("phoneNumber"+request.getParameter("phoneNumber"));
		System.out.println("gender"+request.getParameter("gender"));
		System.out.println("vehicle1"+request.getParameter("vehicle1"));
		System.out.println("vehicle2"+request.getParameter("vehicle2"));
		System.out.println("The Selected Date"+request.getParameter("bday"));
		System.out.println("carsType"+request.getParameter("carsType"));
		
		request.getRequestDispatcher("confirmation.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}