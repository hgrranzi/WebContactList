package ru.hgrranzi.app.servlets;

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
        if (model.getContactMap().containsKey(nickname)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("dynamic/updating.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("error", "The contact with nickname " + nickname + "does not exist.");
        }
    }
}
