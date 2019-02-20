package com.yiibai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SayHello
 */
@WebServlet("/SayHello")
public class SayHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SayHello() {
        super();
        System.out.println("super");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
        if(name==null){
            name = "";
        }
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>SayHello Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is "+this.getClass()+", using the POST method");
        out.println("<hr/>");
        out.println("Hello, "+name);
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
        //out.println(name);
		//response.getWriter().append("dopost Served at: ").append(request.getContextPath());
		
	}

}
