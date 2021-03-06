<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="ru.hgrranzi.app.model.Model" %>
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
        String date = "Current date: " + new Date();
        String numberOfContacts = "Number of contacts in the list: " + Model.getInstance().getContactMap().size();
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
        <button onclick="location.href='/update'">Update contact</button>
        <button onclick="location.href='/delete'">Delete contact</button>
      </div>
    </div>
  </body>
</html>
