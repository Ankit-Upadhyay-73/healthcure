package com.healthcare;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayImage extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

			String URLAfterWebDomain = request.getRequestURI();

	        response.setContentType("image/jpeg"); //as far as I know, this works for PNG as well. You might want to change the mapping to /images/*.jpg if it's giving problems

	        ServletOutputStream outStream;
	        outStream = response.getOutputStream();
	        FileInputStream fin = new FileInputStream("");

	        BufferedInputStream bin = new BufferedInputStream(fin);
	        BufferedOutputStream bout = new BufferedOutputStream(outStream);
	        int ch =0; ;
	        while((ch=bin.read())!=-1)
	            bout.write(ch);

	        bin.close();
	        fin.close();
	        bout.close();
	        outStream.close();	    
	    
	}
	
}
