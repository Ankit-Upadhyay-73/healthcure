package com.healthcare.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.healthcare.database.DBConnection;
import com.healthcare.model.Request;

public class RequestDao {
	
	public Request getRequest(String username) throws ClassNotFoundException, SQLException {

		Request req = new Request();
		
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM requests where username=?");
		ps.setString(1, username);
		
		ResultSet rs = ps.executeQuery();		
		if(rs.next()) {
			req.setUsername(rs.getString("username"));
			req.setContact(rs.getString("contact"));
			req.setTest(rs.getString("test"));
		}
		return req;
	}
	
	public boolean setRequest(Request req) throws SQLException, ClassNotFoundException {
	
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO requests(username, contact, test) values (?, ?, ?)");
		ps.setString(1, req.getUsername());
		ps.setString(2, req.getContact());
		ps.setString(3, req.getTest());
		
		int count = ps.executeUpdate();
		return true;
	}	
}
