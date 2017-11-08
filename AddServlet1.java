package com.lyq.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1 implementation class AddServlet1
 */
@WebServlet("/AddServlet1")
public class AddServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		String name = request.getParameter("name");
		
		String author = request.getParameter("author");
		
		String price = request.getParameter("price");
		
		
	
		out.println("<h2>添加信息</h2><hr>");
		out.println("图书编号" + id + "<br>");
		out.println("图书名称" + name + "<br>");
		out.println("作者" + author + "<br>");
		out.println("价格" + price + "<br>");
	
		
		out.flush();
		
		out.close();
	}
}
