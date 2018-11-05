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
        <title>New Reader page</title>
    </head>
    <body>
        <div>
            <h3>Add new Reader to the Library</h3><br><br>
            <form action="addReader" method="POST" name="form1" id="form1">
                Name:<br>
                <input type="text" name="name" placeholder="Name"><br><br>
                Surname:<br>
                <input type="text" name="surname" placeholder="Surname"><br><br>
                Phone:<br>
                <input type="text" name="phone" placeholder="Phone"><br><br>
                City:<br>
                <input type="text" name="city" placeholder="City"><br><br>
                Login:<br>
                <input type="text" name="login" placeholder="Phone"><br><br>
                Password:<br>
                <input type="text" name="password1" placeholder="Phone"><br><br>
                Re-enter password:<br>
                <input type="text" name="password2" placeholder="Phone"><br><br>
                <input type="submit" value="Add reader">
            </form><br><br>


        </div>
    </body>
</html>
