package com.mm.servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myHttpServlet")
public class MyHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 20240410034000L;

	static {
		System.out.println("MyHttpServlet.static");
	}

	public MyHttpServlet() {
		System.out.println("MyHttpServlet.MyHttpServlet()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MyHttpServlet.doGet()");
		PrintWriter out = resp.getWriter();
		out.println("MyHttpServlet.doGet()");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MyHttpServlet.doPost()");
		PrintWriter out = resp.getWriter();
		out.println("MyHttpServlet.doPost()");
	}

}
