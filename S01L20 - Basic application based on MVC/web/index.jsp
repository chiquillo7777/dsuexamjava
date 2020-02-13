<%-- 
    Document   : index
    Created on : Feb 13, 2020, 9:46:36 AM
    Author     : carlos.chiquillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        It's home page <br/>
        <a href="<%=request.getContextPath()%>/Controller?page=login">Login</a>
        <a href="<%=request.getContextPath()%>/Controller?page=signup">Sign Up</a>
        <a href="<%=request.getContextPath()%>/Controller?page=about">About</a>
    </body>
</html>
