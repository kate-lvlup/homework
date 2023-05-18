package com.example.webexmaple1.controller;

import java.io.IOException;
import java.util.List;

import com.example.webexmaple1.dao.imp.UserDaoImpl;
import com.example.webexmaple1.model.User;
import com.example.webexmaple1.model.command.UserCommand;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "users-servlet", value = "/users")
public class UsersServlet extends HttpServlet {
    public final UserDaoImpl userDao;

    public UsersServlet() {
        this.userDao = new UserDaoImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<User> dbUsers = userDao.getAllUsers();
        List<UserCommand> usersCommand = UserCommand.usersToCommand(dbUsers);
        request.setAttribute("users", usersCommand);
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }

}