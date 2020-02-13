<%-- 
    Document   : submit
    Created on : Feb 13, 2020, 11:08:24 AM
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
        Name: <%= request.getParameter("name")%><br/>
        Gender: <%= request.getParameter("gender")%><br/>
        Language: <% 
        String[] countries = request.getParameterValues("language");
        if(countries != null){
            for(int i=0; i< countries.length; i++){
                out.print("<br/>");
                out.print(countries[i]);
            }
        }
        
        
        %><br/>
        Country: <%= request.getParameter("country")%><br/>
    </body>
</html>
