<%-- 
    Document   : diagnose
    Created on : Mar 5, 2024, 2:09:37 PM
    Author     : Ankit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diagnose here</title>
    </head>
    <body>
        <div>
            <h1> Input blood test details or
                        <a href="tel:+919028899706">call</a>
            </h1>
            <form action="test-request" method="post">
                <label for="uname"> Your name: </label>
                <input type="text" name="uname" id="uname">
                <br>
                <label for="contact"> Your contact-no: </label>
                <input type="number" name="contact" id="contact">
                <br>
                <label for="test_name"> Test name: </label>
                     <input type="text" name="test_name" id="test_name">
                <br>
                <input type="submit" value="Submit" />                
            </form>
        </div>
        
        <div>
            <p>
                We can assure about your health reports to be correct and best accuracy, with 
                safe collection, experienced Technicians and Understandable Reports.
            </p>
        </div>
    </body>
</html>