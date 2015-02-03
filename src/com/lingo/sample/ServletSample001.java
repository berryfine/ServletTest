package com.lingo.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Berryfine on 2/1/2015.
 */
@WebServlet(name = "ServletSample001",urlPatterns = {"/ServletSample001Path"})
public class ServletSample001 extends HttpServlet {
    public static final long servletSeriousVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h3>hello, java servlet</h3>");
        out.flush();
    }
}
