<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>WebContactList</title>
  </head>
  <body>
    <div>
      <h1>WebContactList</h1>
    </div>
    <p>
        <%
        String date = "Current date: " + new java.util.Date();
        String numberOfContacts = "Number of contacts in the list: " + ru.hgrranzi.app.model.Model.getInstance().getContactList().size();
        %>
        <%= date %>
    </p>
    <p>
        <%= numberOfContacts %>
    </p>
    <div>       <!-- content -->
      <div>    <!-- buttons holder -->
        <button onclick="location.href='/add'">Add contact</button>
        <button onclick="location.href='/show'">Show contacts</button>
      </div>
    </div>
  </body>
</html>
