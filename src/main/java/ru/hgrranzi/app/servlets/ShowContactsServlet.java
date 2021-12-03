package ru.hgrranzi.app.servlets;

import ru.hgrranzi.app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class ShowContactsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> contacts = model.listContacts();
        req.setAttribute("contacts", contacts);

        RequestDispatcher dispatcher = req.getRequestDispatcher("dynamic/show.jsp");
        dispatcher.forward(req, resp);
    }
}
