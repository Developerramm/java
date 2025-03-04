package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = (int)req.getAttribute("sum");
		int mul = number1 * number2;
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("<h3>The sum is " + sum + "</h3>");
		out.println("<h3>The mul is " + mul + "</h3>");
	}

}
