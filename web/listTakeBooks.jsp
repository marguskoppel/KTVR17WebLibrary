<%-- 
    Document   : takeBooks.jsp
    Created on : Oct 5, 2018, 10:38:13 AM
    Author     : Melnikov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taken books</title>
    </head>
    <body>
        <h1>List of taken books</h1>
        <ul>
            <c:forEach var="history" items="${takeBooks}">
                <li>Book: ${history.book.bookName} was taken by: ${history.reader.name} ${history.reader.surname} at ${history.bookIssued}
                <a href="returnBook?historyId=${history.id}"> Return book</a>
                </li>
            </c:forEach> 
        </ul>
    </body>
</html>
