<%-- 
    Document   : newBook
    Created on : Sep 26, 2018, 10:58:54 AM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NewBook page</title>
    </head>
    <body>
        <div>
            <h3>Add new Book to the Library</h3><br><br>
            <form action="addBook" method="POST" name="form1" id="form1">
                Name of the book:<br>
                <input type="text" name="bookName" placeholder="Name"><br><br>
                Author of the book:<br>
                <input type="text" name="bookAuthor" placeholder="Author"><br><br>
                Year of publishing:<br>
                <input type="text" name="bookPublish" placeholder="Publishing year"><br><br>
                ISBN:<br>
                <input type="text" name="bookIsbn" placeholder="ISBN"><br><br>
                Count:<br>
                <input type="text" name="count"><br><br>
                <input type="submit" value="Add book">
            </form><br><br>


        </div>
    </body>
</html>
