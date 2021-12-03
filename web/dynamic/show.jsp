<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.jsp.JspWriter" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Show contacts</title>
    </head>
    <body>
        <h1>Show contacts</h1>
        <button onclick="location.href='/'">Back to main page</button>
        <ul>
            <%
                List<String> nicknames = (List<String>) request.getAttribute("contacts");

                if (nicknames != null && !nicknames.isEmpty()) {
                    for (String s : nicknames) {
                        out.println("<li>" + s + "</li>");
                    }
                }
            %>
        </ul>
    </body>
</html>