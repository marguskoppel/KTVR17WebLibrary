
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Starting page</h1>
        
        
        <a href="newBook">Add Book</a><br>
        <a href="newReader">Add Reader</a><br>
        <a href="showBooks">List of books</a><br>
        <a href="showReaders">List of readers</a><br>
        <a href="library">Take book</a><br>
        <a href="showTakeBook">List of taken books</a>
        
        <br>
        <hr><b>Added book name:</b><br>
            ${book.bookName}<br><br> <!--тут book берется из servlet'a Library -> "book"-->
            <b>Author:</b><br>
            ${book.bookAuthor}<br><br>
            <b>Publishing year:</b><br>
            ${book.bookPublish}<br><br>
            <b>ISBN:</b><br>
            ${book.bookIsbn}<br><br>
            <b>Count:</b><br>
            ${book.count}<br><br>
            
            
            <hr><b>Reader added</b><br><br><br>
            <b>Name:</b><br>
            ${reader.name}<br><br> <!--тут reader берется из servlet'a Library -> "reader"-->
            <b>Surname:</b><br>
            ${reader.surname}<br><br>
            <b>Phone:</b><br>
            ${reader.phone}<br><br>
            <b>City:</b><br>
            ${reader.city}<br>
    </body>
</html>
