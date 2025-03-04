package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		out.println("<h1>Welcome to home page </h1>");
		out.println("Your email " + email);
		out.println("Your password " + password);
	}

}
