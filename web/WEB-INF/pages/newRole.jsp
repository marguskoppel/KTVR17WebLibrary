

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Role</title>
    </head>
    <body>
        <h1>Add new role</h1>
        ${info}
        <form action="addRole" method="POST" name="form1" id="_form1">
             Role name:<br>
            <input type="text" name="nameRole"><br>
            <br>
            <input type="submit" value="Add Role">
        </form><br>
    </body>
</html>
