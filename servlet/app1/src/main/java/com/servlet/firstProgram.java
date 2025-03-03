package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class firstProgram implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method call");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method call");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method call 2");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter(); m 
		out.println("Welcome to servlet app here ");
		out.println("Today is " + new Date().toLocaleString());
	}
}
