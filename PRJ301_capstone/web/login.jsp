<%-- 
    Document   : login
    Created on : 113
    Author     : hd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <!--your code here-->
        <h2>${requestScope.error}</h2>
        <form action="MainController" method="POST">
        Username(*): <input type="text" id="username" name="username" ><br><br>
        
        Password(*): <input type="password" id="password" name="password" ><br>
        <input type="submit" value="Login" name="action">
    </form>
    </body>
    
</html>

