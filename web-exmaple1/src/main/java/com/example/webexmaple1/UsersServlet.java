package com.example.webexmaple1;

import java.io.*;
import java.util.List;

import com.example.webexmaple1.model.User;
import com.example.webexmaple1.util.HibernateUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@WebServlet(name = "users-servlet", value = "/users")
public class UsersServlet extends HttpServlet {

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + "USERS DEPLOYED" + "</h1>");
//        out.println("</body></html>");
//        out.close();
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();

//        Create CriteriaQuery
        CriteriaQuery<User> criteria = builder.createQuery(User.class);

//        Specify criteria root
        criteria.from(User.class);

//        Execute query
        List<User> users = session.createQuery(criteria).getResultList();
        transaction.commit();
        request.setAttribute("users", users);
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}