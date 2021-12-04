package ru.hgrranzi.app.servlets;

import ru.hgrranzi.app.entities.Contact;
import ru.hgrranzi.app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("dynamic/add.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nickname = req.getParameter("nickname");
        String firstName = req.getParameter("firstname");
        String lastName = req.getParameter("lastname");
        String age = req.getParameter("age");
        String phoneNumber = req.getParameter("phone");
        String email = req.getParameter("email");
        Contact contact;
        try {
            contact = new Contact(nickname, firstName, lastName, age, phoneNumber, email);
            Model model = Model.getInstance();
            model.addContact(contact);
            req.setAttribute("nick", nickname);
        } catch (IllegalArgumentException e) {
            req.setAttribute("error", e.getMessage());
        }
        doGet(req, resp);
    }
}
