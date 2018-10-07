<%-- 
    Document   : bookList
    Created on : Sep 27, 2018, 9:48:37 PM
    Author     : st0lu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of readers</title>
    </head>
    <body>
        <h1>Readers</h1>
        <ul>
            <c:forEach var="book" items="${bookList}">
                <li>${book.bookName} ${book.bookAuthor}</li>

            </c:forEach>
        </ul>
        
    </body>
</html>
