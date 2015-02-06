package com.lingo.sample;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Berryfine on 2/2/2015.
 */
public class XmlServletSample extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");
        HttpSession session = request.getSession();
        if(userName!=null && userName!=""){
            session.setAttribute("savedUserName",userName);
        }
        out.println("hello "+userName +" welcome to getMethod");
        out.println("Hello, I have been remembered. "+session.getAttribute("savedUserName"));
        out.flush();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");
        String fullName = request.getParameter("fullName");
        out.write("hello " + userName + ", welcome to PostMethod.");
        out.write("your full name is "+fullName);
        String professor = request.getParameter("prof");
        out.write("\n you are a "+professor);
        String[] locations  = request.getParameterValues("location");
        out.write("\n you have lived in:");
        for(String s:locations){
            out.write(s+",\t");
        }
        out.flush();
    }
}
