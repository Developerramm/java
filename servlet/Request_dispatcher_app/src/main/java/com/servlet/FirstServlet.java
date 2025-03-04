package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		
		RequestDispatcher rd;
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		if("demo@gmail.com".equals(email) && "demo".equals(password)) {
			// go to home page
			rd = req.getRequestDispatcher("/servlet2");
			rd.forward(req, res);
		}else {
			// go to login page 
			out.println("<h3>Invalid Email and password </h3>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
}
