<%-- 
    Document   : checkTexture
    Created on : 7 Nov, 2019, 2:34:55 PM
    Author     : c3
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct" uri="/WEB-INF/tlds/CustomTld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Texture</title>
    </head>
    <body>
        <form action="checkTexture.jsp">
            Enter Texture:<br><br>
            <input type="text" name="texture" required/><br><br>
            <input type="submit" value="Submit"/><br><br>
        </form>
        
        <c:if test="${param.texture != null}">
            <ct:choco texture="${param.texture}"/>
        </c:if>
        
    </body>
</html>
