package com.example.webexmaple1.controller;

import com.example.webexmaple1.dao.imp.UserDaoImpl;
import com.example.webexmaple1.model.command.UserUpdateCommand;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "UserUpdateServlet", value = "/update")
public class UserUpdateServlet extends HttpServlet {

    public final UserDaoImpl userDao;

    public UserUpdateServlet() {
        this.userDao = new UserDaoImpl();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String username = request.getParameter("username");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        LocalDate birthday = LocalDate.parse(request.getParameter("birthday"));
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");

        UserUpdateCommand userUpdateCommand = UserUpdateCommand.builder()
//                .id(id)
                .username(username)
                .firstName(firstName)
                .lastName(lastName)
                .date(birthday)
                .email(email)
                .phoneNumber(phoneNumber)
                .address(address)
                .build();

        userDao.updateUserById(id, userUpdateCommand);
        response.sendRedirect("users");
    }
}
