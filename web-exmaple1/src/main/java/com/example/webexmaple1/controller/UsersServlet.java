package com.example.webexmaple1.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
        setAndDeleteAttributesForUpdate(request);

        List<User> dbUsers = userDao.getAllUsers();
        List<UserCommand> usersCommand = UserCommand.usersToCommand(dbUsers);

        request.setAttribute("users", usersCommand);
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }

    private void setAndDeleteAttributesForUpdate(HttpServletRequest request){
        Map<String, String> errors = (Map<String, String>) request.getSession().getAttribute("errors");

        if (errors != null && !errors.isEmpty()) {
            Long id = (Long) request.getSession().getAttribute("id");
            String username = (String) request.getSession().getAttribute("username");
            String firstName = (String) request.getSession().getAttribute("firstName");
            String lastName = (String) request.getSession().getAttribute("lastName");
//            LocalDate birthday = (LocalDate) request.getSession().getAttribute("birthday");
            String email = (String) request.getSession().getAttribute("email");
            String phoneNumber = (String) request.getSession().getAttribute("phoneNumber");
            String address = (String) request.getSession().getAttribute("address");

            request.setAttribute("id", id);
            request.setAttribute("username", username);
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
//            request.setAttribute("birthday", birthday);
            request.setAttribute("email", email);
            request.setAttribute("phoneNumber", phoneNumber);
            request.setAttribute("address", address);
            request.setAttribute("errors", errors);

            request.getSession().removeAttribute("id");
            request.getSession().removeAttribute("username");
            request.getSession().removeAttribute("firstName");
            request.getSession().removeAttribute("lastName");
//            request.getSession().removeAttribute("birthday");
            request.getSession().removeAttribute("email");
            request.getSession().removeAttribute("phoneNumber");
            request.getSession().removeAttribute("address");
            request.getSession().removeAttribute("errors");
        }
    }

}