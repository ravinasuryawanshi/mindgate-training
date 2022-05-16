package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter printWriter;
	private double number1;
	private double number2;
       private double ans;
   
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in doget()");
		number1=Double.valueOf(request.getParameter("textno1"));
		number2=Double.valueOf(request.getParameter("textno2"));
		ans=number1+number2;
		printWriter=response.getWriter();
		printWriter.println("addition of"+number1+ "and" +number2 +ans);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in dopost()");
		number1=Double.valueOf(request.getParameter("textno1"));
		number2=Double.valueOf(request.getParameter("textno2"));
		ans=number1+number2;
		printWriter=response.getWriter();
		printWriter.println("addition of"+number1+ "and" +number2 +ans);
	}

}
