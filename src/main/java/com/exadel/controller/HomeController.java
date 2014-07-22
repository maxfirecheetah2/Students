package com.exadel.controller;


import com.exadel.util.HibernateUtil;
import org.hibernate.Session;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/login")
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.getTransaction().commit();

        RequestDispatcher dispatch = req.getRequestDispatcher("/WEB-INF/profilePage.jsp");
        dispatch.forward(req, resp);

    }
}