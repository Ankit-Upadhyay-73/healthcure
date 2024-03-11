<%-- Document : diagnose Created on : Mar 5, 2024, 2:09:37 PM Author : Ankit
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%> <%@include
file="header.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Diagnose here</title>
  </head>
  <body>
    <div class="container">
      <h1>
        Input blood test details or
        <a href="tel:+919028899706">call</a>
      </h1>
      <form action="storetest" method="post">
        <div class="form-group">
        <label for="uname" class="form-label"> Your name: </label>
        <input type="text" name="username" id="uname" class="form-control" placeholder="eg. Ankit Upadhyay" required />
        </div>
        <div class="form-group">
          <label for="contact" class="form-label"> Your contact-no: </label>
          <input type="number" name="contact" id="contact" class="form-control" placeholder="eg. +91 9028899706" required />
        </div>
        <div class="form-group">
          <label for="test_name" class="form-label"> Test name: </label>
          <input type="text" name="test" id="test_name" class="form-control" placeholder="eg. CBC (Complete Blood Count)" required />
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      
      <div>
        <p>
          We can assure about your health reports to be correct and best accuracy,
          with safe collection, experienced Technicians and Understandable
          Reports.
        </p>
      </div>      
    </div>

  </body>
</html>
