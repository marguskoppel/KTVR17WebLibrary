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
        <title>List of books</title>
    </head>
    <body>
        <h1>Books</h1>
        <ul>
            <c:forEach var="book" items="${bookList}">
                <li>"${book.bookName}" by ${book.bookAuthor} (count: ${book.count})
                <a href="deleteBook?deleteBookId=${book.id}">Delete book</a>
                </li>

            </c:forEach>
        </ul>
        
    </body>
</html>
