package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.Dao.EmployeeDao;
import com.mindgate.pojo.Employee;


@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private String name;
	private double salary;
	private PrintWriter out;
	private EmployeeDao employeedao=new EmployeeDao();
	private boolean result;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		out=response.getWriter();
		name=request.getParameter("text1");
		salary= Double.valueOf(request.getParameter("text2"));
		out.print("name ::" +name);
		out.print("salary ::" +salary);
		Employee employee =new Employee(0, name, salary);
		result=employeedao.addemployee(employee);
		
		response.setContentType("text/html");
		if(result) {
			out.print("Record added successfully");
			out.println("<a href=employeehome.html> Home Page</a");
		}
		else
		{
			out.print("Failed to add record");
			out.println("<a href=employeehome.html> Home Page</a");
		}
		
	}

}
