<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Add contact</title>
    </head>
    <body>
        <h1>Add contact page</h1>
        <button onclick="location.href='/'">Back to main page</button>
        <%
            String message = "Add new contact";
            if (request.getAttribute("nick") != null) {
                message = request.getAttribute("nick").toString() + " added! " + message;
            } else if (request.getAttribute("error") != null) {
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

            <label>First name:
                <input type="text" name="firstname"><br />
            </label>

            <label>Last name:
                <input type="text" name="lastname"><br />
            </label>

            <label>Age:
                <input type="text" name="age"><br />
            </label>

            <label>Phone number:
                <input type="text" name="phone"><br />
            </label>

            <label>email:
                <input type="text" name="email"><br />
            </label>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>