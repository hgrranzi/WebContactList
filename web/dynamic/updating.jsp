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
<h2>Update <%=request.getAttribute("nickname")%></h2>
<form method="post">
    <label>
        <input hidden type="text" name="nickname" value="<%=request.getAttribute("nickname")%>"><br />
    </label>

    <label>First name:
        <input type="text" name="firstname" value="<%=request.getAttribute("firstname")%>"><br />
    </label>

    <label>Last name:
        <input type="text" name="lastname" value="<%=request.getAttribute("lastname")%>"><br />
    </label>

    <label>Age:
        <input type="text" name="age" value="<%=request.getAttribute("age")%>"><br />
    </label>

    <label>Phone number:
        <input type="text" name="phone" value="<%=request.getAttribute("phone")%>"><br />
    </label>

    <label>email:
        <input type="text" name="email" value="<%=request.getAttribute("email")%>"><br />
    </label>
    <button type="submit" value="updating">Submit</button>
</form>
</body>
</html>