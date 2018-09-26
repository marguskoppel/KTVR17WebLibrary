

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page2.jsp</h1>
        ${textToPage} <!-- переменная из servlet1-->
        <a href="newBook">Add book</a><br><br>
         Added book name:<br>
            ${book.bookName}<br><br> <!--тут book берется из servlet'a Library -> "book"-->
            Author:<br>
            ${book.bookAuthor}<br><br>
            Publishing year:<br>
            ${book.bookPublish}<br><br>
            ISBN:<br>
            ${book.bookIsbn}<br>
    </body>
</html>
