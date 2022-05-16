package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String id;
	private String password;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter=response.getWriter();
		id=request.getParameter("text1");
		password=request.getParameter("text2");
		if(id.equals("admin") && password.equals("abcd"))
		{
			printWriter.print("login success");
		}
		else
		{
			printWriter.print("invalid id and password");
		}
//		if(password=="abc")
//		{
//			System.out.println("Welcome user");
//		}
//		else
//		{
//			System.out.println("Invalid user Id and password");
//		}
		
		
	}

}
