package com.uniovi.sdi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ServletSaludo
 */
@WebServlet("/ServletSaludo")
public class ServletSaludo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletSaludo() {
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException { 
    		// TODO Auto-generated method stub 
    		//response.getWriter().append("Served at: ").append(request.getContextPath()); 
    		response.setContentType("text/html"); 
    		PrintWriter out = response.getWriter(); 
    		out.println("<HTML>"); 
    		out.println("<HEAD><TITLE>Hola Mundo!</TITLE></HEAD>"); 
    		out.println("<BODY>");
    		String nombre = (String) request.getParameter("nombre"); if (nombre != null) { 
    			out.println("Hola " + nombre + "<br>"); 
    			} 
    			out.println("</BODY></HTML>");
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    	doGet(request,response); 
    	}
}
