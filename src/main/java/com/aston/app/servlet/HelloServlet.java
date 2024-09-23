package com.aston.app.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "HelloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(HelloServlet.class.getName());

    private final String title = "hello-servlet";
    private final String content = "content of hello-servlet!";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", title);
        req.setAttribute("content", content);
        logger.info("Attribute 'title' set to: " + title);
        logger.info("Attribute 'content' set to: " + content);
        req.getRequestDispatcher("/hello-page.jsp").forward(req, resp);
    }
}
