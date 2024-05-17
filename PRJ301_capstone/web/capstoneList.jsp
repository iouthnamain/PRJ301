<%-- 
    Document   : admin
    Created on : Mar 1, 2022, 8:29:12 PM
    Author     : hd
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Capstone list</title>
        <style>
            table {
                border-collapse: collapse;
                width: 80%;
            }
            th, td {
                border: 1px solid black; /* Đặt đường viền cho các ô */
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <!--your code here-->
        <h1>Welcome, ${sessionScope.acc.fullName}</h1>
        <form action="MainController" method="get">
            Search by FullName: <input type="text" name="txtSearch" value="" />
            <!--            Status: <input type="checkbox" name="status" value="true"/> true
                        <input type="checkbox" name="status" value="false"/> false-->

            <!--            Status: <input type="radio" name="status" value="true"/> True
                        <input type="radio" name="status" value="false"/> False-->
            <input type="submit" name="action" value="search" /> <br>

        </form>
        <h3>Search value: ${requestScope.lastSearch}</h3>
        <!--        <table>
                    <tbody>
                        <tr>
                            <th>no</th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Description</th> 
                            <th>userID</th>
                            <th>Delete</th>
                        </tr>
        <c:set var="index" value="0" />
        <c:forEach var="c" items="${list}">
            <c:set var="index" value="${index + 1}" />
            <tr>
                <td>${index}</td>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.description}</td>
                <td>${c.userID}</td>
                <td><button><a href="MainController?action=delete&pk=${c.id}&lastSearch=${requestScope.lastSearch}">Delete</a></button></td>
            </tr>
        </c:forEach>
    </tbody>
</table>-->

        <c:choose>
            <c:when test="${empty list}">
                <p>${xx}</p>
            </c:when>
            <c:otherwise>
                <table>
                    <tbody>
                        <tr>
                            <th>no</th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Description</th> 
                            <th>userID</th>
                            <th>Delete</th>
                        </tr>
                        <c:set var="index" value="0" />
                        <c:forEach var="c" items="${list}">
                            <c:set var="index" value="${index + 1}" />
                            <tr>
                                <td>${index}</td>
                                <td>${c.id}</td>
                                <td>${c.name}</td>
                                <td>${c.description}</td>
                                <td>${c.userID}</td>
                                <td><button><a href="MainController?action=delete&pk=${c.id}&lastSearch=${requestScope.lastSearch}">Delete</a></button></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:otherwise>
        </c:choose>

        <h2>${deleteError}</h2>        
        <form action="MainController" method="post">
            <input type="submit" value="logout" name="action">
        </form>
    </body>
</html>
