package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		String course = req.getParameter("user_class");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(course);

		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h3>Name " + name + "<h3>");
		out.println("<h3>Email " + email + "<h3>");
		out.println("<h3>Password " + password + "<h3>");
		out.println("<h3>Course " + course + "<h3>");
	}

}
