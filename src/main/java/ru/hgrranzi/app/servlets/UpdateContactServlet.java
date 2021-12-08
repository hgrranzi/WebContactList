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

@WebServlet("/update")
public class UpdateContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("dynamic/update.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nickname = req.getParameter("nickname");
        Model model = Model.getInstance();
        String age = req.getParameter("age");
        if (age == null) {
            if (!nickname.equals("")) {
                if (model.getContactMap().containsKey(nickname)) {
                    req.setAttribute("nickname", nickname);
                    req.setAttribute("firstname", model.getContactMap().get(nickname).getFirstName());
                    req.setAttribute("lastname", model.getContactMap().get(nickname).getLastName());
                    req.setAttribute("age", model.getContactMap().get(nickname).getAge());
                    req.setAttribute("phone", model.getContactMap().get(nickname).getPhoneNumber());
                    req.setAttribute("email", model.getContactMap().get(nickname).getEmail());
                    RequestDispatcher dispatcher = req.getRequestDispatcher("dynamic/updating.jsp");
                    dispatcher.forward(req, resp);

                } else {
                    req.setAttribute("error", "The contact with nickname " + nickname + " does not exist.");
                    doGet(req, resp);
                }
            } else {
                doGet(req, resp);
            }
        } else {
            nickname = req.getParameter("nickname");
            String firstName = req.getParameter("firstname");
            String lastName = req.getParameter("lastname");
            age = req.getParameter("age");
            String phoneNumber = req.getParameter("phone");
            String email = req.getParameter("email");
            Contact contact;
            try {
                contact = new Contact(nickname, firstName, lastName, age, phoneNumber, email);
                model.updateContact(contact.getNickname(), contact);
                req.setAttribute("nick", nickname);
            } catch (IllegalArgumentException e) {
                req.setAttribute("error", e.getMessage());
            }
            doGet(req, resp);
        }
        }
    }

