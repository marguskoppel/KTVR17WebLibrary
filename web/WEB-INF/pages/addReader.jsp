

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>AddReader page</h1>
        ${textToPage} <!-- переменная из servlet1-->
        
            <a href="newReader">Add reader</a><br><br>
         Reader added<br><br>
            Name:<br>
            ${reader.name}<br><br> <!--тут reader берется из servlet'a Library -> "reader"-->
            Surname:<br>
            ${reader.surname}<br><br>
            Phone:<br>
            ${reader.phone}<br><br>
            City:<br>
            ${reader.city}<br>
    </body>
</html>
