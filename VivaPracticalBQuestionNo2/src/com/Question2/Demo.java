package com.Question2;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class Demo extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        res.setContentType("text/html");
	        PrintWriter out = res.getWriter();

	        for (int i = 0; i < 5; i++) {
	            out.println("Jana Bhawana Campus<br>");
	        }
	    }
	}

	
	



	
