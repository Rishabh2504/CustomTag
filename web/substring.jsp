<%-- 
    Document   : substring
    Created on : 7 Nov, 2019, 3:32:46 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct" uri="/WEB-INF/tlds/CustomTld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SubString</title>
    </head>
    <body>
        <h1>
            <ct:sub input="hello World" start="6" end="11"/>
        </h1>
    </body>
</html>
