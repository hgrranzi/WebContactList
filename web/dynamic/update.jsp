<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.jsp.JspWriter" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Update contact</title>
    </head>
    <body>
        <h1>Update contact</h1>
        <button onclick="location.href='/'">Back to main page</button>
        <%
            String message = "Enter the nickname";
            if (request.getAttribute("error") != null) {
                message = "Error! " + request.getAttribute("error").toString() + " Try again";
            }
        %>
        <p>
            <%= message%>
        </p>
        <form method="post">
            <label>Nickname:
                <input type="text" name="nickname"><br />
            </label>
            <button type="submit">Update</button>
        </form>
    </body>
</html>