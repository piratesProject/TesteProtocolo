package br.com.teste.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		// parte 1
		
		response.getWriter().print("Mundo Novo Servlet");
		
		// parte 2
		
		// antes de testar a parte 2, comente a parte 1
		
	/*	String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		
		response.getWriter().println("Ola " + nome + " " + sobrenome);
	*/	
	}
	
	// parte 3
	/*
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		
		response.getWriter().println("Ola POST " + nome + " " + sobrenome);
	}
	*/
	
	// parte 4
	/*
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		response.getWriter().println("Ola PUT rsrs");
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		response.getWriter().println("Ola DELETE");
	}
	*/
}
