<%-- 
    Document   : home
    Created on : Mar 5, 2024, 1:20:11 PM
    Author     : Ankit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="index.css" />
    </head>
    <body>
        
        <section>
            <div class="intro">
                <card>
                    <div>
                        <p>
                            Lab to reach all your impurities.
                            Trusted machines, Trusted Life
                        </p>
                    </div>
                    <div>
                        <img alt="abhishek" />
                    </div>
                </card>             
            </div>
            
            
            <div class="diff">
                
                <div>
                    <h1>
                        How Labs Work?
                    </h1>
                    <div>
                        <div>
                            <img alt="collect-sample" />                            
                            <p>Sample Collection </p>
                        </div>
                        <div>
                            <img alt="collect-sample" />                            
                            <p>Diagnose at trusted labs</p>
                        </div>
                        <div>
                            <img alt="collect-sample" />                            
                            <p>Reverify result</p>
                        </div>
                        <div>
                            <img alt="collect-sample" />                            
                            <p>Print and send report</p>
                        </div>    
                    </div>
                </div>
            </div>
            
            <div>
                <h1>
                    Want yourself tested? Reach to me directly
                </h1>
                <form action="/diagose.jsp">
                    <input type="submit" value="Get Diagnosed Now" />
                </form>
            </div>
            
            
        </section>
        
    </body>
</html>
