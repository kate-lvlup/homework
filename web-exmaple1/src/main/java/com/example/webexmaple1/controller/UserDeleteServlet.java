package com.example.webexmaple1.controller;

import com.example.webexmaple1.dao.imp.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "UserDeleteServlet", value = "/delete")
public class UserDeleteServlet extends HttpServlet {
    public final UserDaoImpl userDao;

    public UserDeleteServlet() {
        this.userDao = new UserDaoImpl();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long id = Long.parseLong(request.getParameter("id"));
        userDao.deleteUserById(id);
        response.sendRedirect("users");

    }

}
