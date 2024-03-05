/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.healthcare;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.healthcare.dao.RequestDao;
import com.healthcare.model.Request;

/**
 *
 * @author Ankit
 */
@WebServlet("/storetest")
public class RequestTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    		RequestDao dao = new RequestDao();
    		try {
			    	dao.setRequest(new Request(request.getParameter("username"), request.getParameter("contact"), request.getParameter("test")));
		    		response.getWriter().println("Your blood test request captured, you will get call within 10mins");
		    		
//		    		response.sendRedirect("home.jsp");
		    		
    		} catch (ClassNotFoundException e) {
	    		response.getWriter().println("Exception: "+e.getMessage());
    			e.printStackTrace();
			} catch (SQLException e) {
	    		response.getWriter().println("Exception: "+e.getMessage());
				e.printStackTrace();
			}
    }
}
