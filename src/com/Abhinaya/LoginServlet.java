package com.yourapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String VALID_EMAIL = "user@example.com";
    private static final String VALID_PASSWORD = "password123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (VALID_EMAIL.equals(email) && VALID_PASSWORD.equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", email);
            response.sendRedirect("welcome");
        } else {
            response.sendRedirect("login1.html?error=Invalid email or password");
        }
    }
}
