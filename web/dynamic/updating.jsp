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
<h2>Update 'nickname'</h2>
<form method="post">
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