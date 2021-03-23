package com.rd.testdb.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServelt
 */
@WebServlet("/TestDbServelt")
public class TestDbServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//set up connection
		String user = "springstudent";
		String pass = "springstudent";

		String jdbcurl = "jdbc:mysql://localhost:3306/employee_management_system?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		//get connection
		try {
			PrintWriter out = response.getWriter();
			 out.println("connecting to db " +jdbcurl);
		    Class.forName(driver);
		    Connection myConn = DriverManager.getConnection(jdbcurl, user, pass);
		    out.println("success ; tested by rd");
		    myConn.close();
		    
		}
		catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
		
	
	}

}
